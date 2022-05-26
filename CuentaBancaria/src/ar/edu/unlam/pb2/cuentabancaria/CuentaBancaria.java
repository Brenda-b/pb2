package ar.edu.unlam.pb2.cuentabancaria;

import java.time.LocalDateTime;

import java.util.LinkedList;

public class CuentaBancaria {

	protected Double saldoActual;
	protected Integer id;
	
	protected LinkedList<Transaccion> transacciones;
	
	public CuentaBancaria(Integer id) {
		
		this.id= id;
		
		this.saldoActual = 0.0;
		
		this.transacciones= new LinkedList<Transaccion>();
	}

	public void depositar(Double SALDO_A_DEPOSITAR,Integer id, String motivo) {
		this.saldoActual += SALDO_A_DEPOSITAR;
		LocalDateTime fecha = LocalDateTime.now();
		Transaccion transaccion= new Transaccion(id, SALDO_A_DEPOSITAR, motivo, fecha);
		
		this.transacciones.addLast(transaccion);
		
		
	}

	
	public Double getSaldoActual() {
		return saldoActual;
	}

	public void setSaldoActual(Double saldoActual) {
		this.saldoActual = saldoActual;
	}

	public Boolean extraer(Double SALDO_A_EXTRAER,Integer id, String motivo) {
		if(SALDO_A_EXTRAER <= this.saldoActual) {
			this.saldoActual -= SALDO_A_EXTRAER;
			LocalDateTime fecha = LocalDateTime.now();
			Transaccion transaccion= new Transaccion(id, SALDO_A_EXTRAER, motivo, fecha);
			this.transacciones.addLast(transaccion);
			return true;
		}
		return false;
	}
	
	
	/*Tengo que agregar una coleccion para saber la cantidad de movimientos de cada cuenta.*/

}
