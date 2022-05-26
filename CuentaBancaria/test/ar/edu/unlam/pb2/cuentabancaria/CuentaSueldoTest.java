package ar.edu.unlam.pb2.cuentabancaria;

import org.junit.Assert;
import org.junit.Test;

public class CuentaSueldoTest {

	Integer numeroDeCuentaBancaria= 3;

	String motivoPorDeposito= "Algo";
	
	public void cuandoCreoUnaCuentaSueldo() {
		CuentaSueldo cuentaSueldo = creoCuentaSueldo(numeroDeCuentaBancaria);
		
		Assert.assertEquals(CuentaSueldo.class, cuentaSueldo.getClass());
	}
	
	//creamos la primer cuenta bancaria generica
	private CuentaSueldo creoCuentaSueldo(Integer id) {
		return new CuentaSueldo(id);
	}

	@Test

	public void cuandoDepositoDineroEnLaCuentaSueldo() {
		CuentaSueldo cuentaSueldo= creoCuentaSueldo(numeroDeCuentaBancaria);
		final Double SALDO_A_DEPOSITAR= 150.00;
		cuentaSueldo.depositar(SALDO_A_DEPOSITAR, numeroDeCuentaBancaria, motivoPorDeposito);
		Assert.assertEquals(SALDO_A_DEPOSITAR, cuentaSueldo.getSaldoActual());
		
		
	}
	@Test

	public void cuandoExtaemosDineroDeCuentaSueldo() {
		
		CuentaSueldo cuentaSueldo= creoCuentaSueldo(numeroDeCuentaBancaria);
		final Double SALDO_A_EXTRAER = 150.00;
		final Double SALDO_A_DEPOSITAR= 10000.00;
		cuentaSueldo.depositar(SALDO_A_DEPOSITAR, numeroDeCuentaBancaria, motivoPorDeposito);
		Assert.assertTrue(cuentaSueldo.extraer(SALDO_A_EXTRAER, numeroDeCuentaBancaria, motivoPorDeposito));
	}
	@Test
	
	public void cuandoNoPodemosExtraerDineroDeCuentaSueldo() {
		
		CuentaSueldo cuentaSueldo= creoCuentaSueldo(numeroDeCuentaBancaria);
		final Double SALDO_A_EXTRAER = 500.00;
	
		Assert.assertFalse(cuentaSueldo.extraer(SALDO_A_EXTRAER, numeroDeCuentaBancaria, motivoPorDeposito));
	}


		
}
