package ar.edu.unlam.pb2.cuentabancaria;

import org.junit.Assert;
import org.junit.Test;


public class CajaDeAhorroTest {
	Integer numeroDeCuentaBancaria= 3;

	String motivoPorDeposito= "Algo";

	@Test
	
	public void cuandoCreoUnaCajaDeAhorro() {
		CajaDeAhorro cajaDeAhorro = creoUnaCajaDeAhorro(numeroDeCuentaBancaria);
		Assert.assertEquals(CajaDeAhorro.class, cajaDeAhorro.getClass());
	}
	
	
	public CajaDeAhorro creoUnaCajaDeAhorro(Integer id) {
		return new CajaDeAhorro(id);
		
	}
	@Test

	public void cuandoDepositoDineroEnLaCajaDeAhorro() {
		CajaDeAhorro cajaDeAhorro= creoUnaCajaDeAhorro(numeroDeCuentaBancaria);
		final Double SALDO_A_DEPOSITAR= 150.00;
		cajaDeAhorro.depositar(SALDO_A_DEPOSITAR, numeroDeCuentaBancaria, motivoPorDeposito);
		Assert.assertEquals(SALDO_A_DEPOSITAR, cajaDeAhorro.getSaldoActual());
		
		
	}
	@Test

	public void cuandoExtraemosDineroMasDeCincoExtraccionesDeCajaDeAhorro() {
		
		CajaDeAhorro cajaDeAhorro= creoUnaCajaDeAhorro(numeroDeCuentaBancaria);
		final Double SALDO_A_EXTRAER = 150.0;
		final Double SALDO_A_DEPOSITAR= 156.00;
		cajaDeAhorro.depositar(SALDO_A_DEPOSITAR, numeroDeCuentaBancaria, motivoPorDeposito);
		cajaDeAhorro.setNumeroDeExtracciones(6);
		Assert.assertTrue(cajaDeAhorro.extraer(SALDO_A_EXTRAER, numeroDeCuentaBancaria, motivoPorDeposito));
	}
	@Test
	
	public void cuandoNoPodemosExtraerDineroPorqueNoTengoSuficienteDineroPorExtraccionesDeCajaDeAhorro() {
		
		CajaDeAhorro cajaDeAhorro= creoUnaCajaDeAhorro(numeroDeCuentaBancaria);
		final Double SALDO_A_DEPOSITAR= 150.00;
		cajaDeAhorro.depositar(SALDO_A_DEPOSITAR, numeroDeCuentaBancaria, motivoPorDeposito);
		cajaDeAhorro.setNumeroDeExtracciones(7);
		final Double SALDO_A_EXTRAER = 150.0;
		Assert.assertFalse(cajaDeAhorro.extraer(SALDO_A_EXTRAER, numeroDeCuentaBancaria, motivoPorDeposito));
	}
	
		
	
}
