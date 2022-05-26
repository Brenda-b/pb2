package ar.edu.unlam.pb2.cajafuerte;

import org.junit.Assert;
import org.junit.Test;

public class CajaFuerteTest {
	
	private static final int CODIGO_DE_APERTURA= 123;
	
	@Test
	public void alCrearUnaCajaFuerteDeberiaEstarAbierta() {
		/*preparacion - condiciones necesarias- (new) inicializaciones previos al 
		 * comportamiento.given
		 * vacio como es de creacion la vamos a obviar
		 * 
		 * 
		 * ejecucion- cuando creo una caja fuerte when*/
		CajaFuerte caja = cuandoCreoUnaCajaFuerte();
		
		/* 
		 * contrastacion- entonces then*/
		laCajaFuerteEstaAbierta(caja);
		
	}
	
	//Al abrir la caja fuerte con el codigo de serie deberia estar abierta
	@Test
	
	public void alAbrirLaCajaFuerteConElCodigoDeSerieDeberiaAbrirse() {
		
		CajaFuerte caja = dadoQueExisteUnaCajaFuerte();//preparacion
		
		dadoQueCierroLaCajaFuerte(caja, CODIGO_DE_APERTURA);
		
		//Cuando abro la caja fuerte la caja fuerte se abre ejecucion
		
		cuandoAbroLaCajaFuerte(caja, CODIGO_DE_APERTURA);//ejecucion 
		
		
		entoncesLaCajaFuerteSeAbre(caja);//costrastacion
		
		
	}
	

	@Test
	
	public void alAbrirUnaCajaFuerteConElCodigoErroneoNoDeberiaAbrirse() {
		CajaFuerte caja= dadoQueExisteUnaCajaFuerte(); //preparacion
		
		dadoQueCierroLaCajaFuerte(caja, CODIGO_DE_APERTURA); //preparacion
		
		cuandoAbroLaCajaFuerte(caja, CODIGO_DE_APERTURA + 5);//ejecucion
		
		entoncesLaCajaFuerteEstaCerrada(caja); //contrastacion
		
	}
	
	private void cuandoAbroLaCajaFuerte (CajaFuerte caja, Integer codigoDeApertura) {
		caja.abrir(codigoDeApertura);
	
	}
	
	private void dadoQueCierroLaCajaFuerte (CajaFuerte caja, Integer codigoDeApertura) {
		caja.cerrar(codigoDeApertura);
	
	}
	
	private void entoncesLaCajaFuerteSeAbre(CajaFuerte caja) {
		Assert.assertEquals(true, caja.estaAbierta);
		
	}
	
	private CajaFuerte dadoQueExisteUnaCajaFuerte() {
		
		return new CajaFuerte();
	}
	
	private void entoncesLaCajaFuerteEstaCerrada(CajaFuerte caja) {
		//esperado, sobre obtenido
		Assert.assertEquals(false, caja.estaAbierta());
		
	}
	//para dar verde -> no dar null
	private CajaFuerte cuandoCreoUnaCajaFuerte() {
		
		return new CajaFuerte();//constructor
		
	}
	
	private void laCajaFuerteEstaAbierta(CajaFuerte caja) {
		//asercion
		Assert.assertTrue(caja.estaAbierta());
	}

}
