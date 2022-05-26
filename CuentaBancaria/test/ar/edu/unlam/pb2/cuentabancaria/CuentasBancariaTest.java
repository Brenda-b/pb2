package ar.edu.unlam.pb2.cuentabancaria;

import org.junit.Test;
import org.junit.Assert;

public class CuentasBancariaTest {
	Integer numeroDeCuentaBancaria= 3;

	String motivoPorDeposito= "Algo";
@Test
public void cuandoCreoUnaCuentaBancaria() {
	CuentaBancaria cuenta = creoCuentaBancaria(numeroDeCuentaBancaria);
	
	Assert.assertEquals( CuentaBancaria.class, cuenta.getClass());
}
//creamos la primer cuenta bancaria generica
private CuentaBancaria creoCuentaBancaria(Integer id) {
	return new CuentaBancaria(id);
}

@Test

public void cuandoDepositoDineroEnLaCuentaBancaria() {
	
	CuentaBancaria cuenta= creoCuentaBancaria(numeroDeCuentaBancaria);
	final Double SALDO_A_DEPOSITAR= 150.00;
	cuenta.depositar(SALDO_A_DEPOSITAR, numeroDeCuentaBancaria, motivoPorDeposito);
	Assert.assertEquals(SALDO_A_DEPOSITAR, cuenta.getSaldoActual());
	
	
}
@Test

public void cuandoExtaemosDineroDeCuentaBancaria() {
	
	CuentaBancaria cuenta= creoCuentaBancaria(numeroDeCuentaBancaria);
	final Double SALDO_A_DEPOSITAR= 150.00;
	final Double SALDO_A_EXTRAER = 150.0;
	cuenta.depositar(SALDO_A_DEPOSITAR, numeroDeCuentaBancaria, motivoPorDeposito);
	Assert.assertTrue(cuenta.extraer(SALDO_A_EXTRAER, numeroDeCuentaBancaria, motivoPorDeposito));
}


	
}
