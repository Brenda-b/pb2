package ar.edu.unlam.pb2.cuentabancaria;

import org.junit.Assert;
import org.junit.Test;



public class CuentaCorrienteTest {
	Integer numeroDeCuentaBancaria= 3;

	String motivoPorDeposito= "Algo";

	
	@Test
	
	public void cuandoCreoUnaCuentaCorriente() {
		CuentaCorriente cuentaCorriente = creoUnaCuentaCorriente(numeroDeCuentaBancaria);
		Assert.assertEquals( CuentaCorriente.class, cuentaCorriente.getClass());
	}
	
	public CuentaCorriente creoUnaCuentaCorriente(Integer id) {
		return new CuentaCorriente(id);
	}
	@Test

	public void cuandoDepositoDineroEnLaCuentaCorriente() {
		CuentaCorriente cuentaCorriente= creoUnaCuentaCorriente(numeroDeCuentaBancaria);
		final Double SALDO_A_DEPOSITAR= 150.00;
		cuentaCorriente.depositar(SALDO_A_DEPOSITAR, numeroDeCuentaBancaria, motivoPorDeposito);
		Assert.assertEquals(SALDO_A_DEPOSITAR, cuentaCorriente.getSaldoActual());
		
		
	}
	@Test

	public void cuandoExtaemosDineroDeCuentaCorriente() {
		
		CuentaCorriente cuentaCorriente= creoUnaCuentaCorriente(numeroDeCuentaBancaria);
		final Double SALDO_A_EXTRAER = 150.00;
		final Double SALDO_A_DEPOSITAR = 1000.00;
		cuentaCorriente.depositar(SALDO_A_DEPOSITAR, numeroDeCuentaBancaria, motivoPorDeposito);
		Assert.assertTrue(cuentaCorriente.extraer(SALDO_A_EXTRAER, numeroDeCuentaBancaria, motivoPorDeposito));
	}
	@Test
	
	public void cuandoUtilizamosElMontonDescubierto() {
		
		CuentaCorriente cuentaCorriente= creoUnaCuentaCorriente(numeroDeCuentaBancaria);
		final Double SALDO_A_EXTRAER = 200.00;
		final Double SALDO_A_DEPOSITAR= 100.00;
		cuentaCorriente.depositar(SALDO_A_DEPOSITAR, numeroDeCuentaBancaria, motivoPorDeposito);
		cuentaCorriente.setMontoDescubierto(150.00);
		Assert.assertTrue(cuentaCorriente.extraer(SALDO_A_EXTRAER, numeroDeCuentaBancaria, motivoPorDeposito));
	}
	
	@Test
	
	public void cuandoNoPodemosRetirarMonto() {
		
		CuentaCorriente cuentaCorriente= creoUnaCuentaCorriente(numeroDeCuentaBancaria);
		final Double SALDO_A_EXTRAER= 300.00;
		final Double SALDO_A_DEPOSITAR= 100.00;
		cuentaCorriente.depositar(SALDO_A_DEPOSITAR, numeroDeCuentaBancaria, motivoPorDeposito);
		cuentaCorriente.setMontoDescubierto(150.00);
		Assert.assertFalse(cuentaCorriente.extraer(SALDO_A_EXTRAER, numeroDeCuentaBancaria, motivoPorDeposito));
	}
	
}
