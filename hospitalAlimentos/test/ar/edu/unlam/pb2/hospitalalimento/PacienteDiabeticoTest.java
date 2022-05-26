package ar.edu.unlam.pb2.hospitalalimento;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;

public class PacienteDiabeticoTest {

	@Test
	
	public void cuandoCreoUnMenu() {
		
		ArrayList <String> ingredientes = new ArrayList<String>() ;
		
		Menu menu = new Menu("menu general", "frito", ingredientes);
		
		Assert.assertEquals(Menu.class, menu.getClass());
	}
	
	@Test
	
	public void CuandoHayUnIngredienteQueNoPuedeComer() {
		
		ArrayList <String> ingredientes = new ArrayList<String>();
		 
		Menu menu= new Menu("menu general", "frito", ingredientes);
		
		PacienteDiabetico pacienteDiabetico = new PacienteDiabetico();
		
		ingredientes.add("azucar");
		
		Assert.assertFalse(pacienteDiabetico.puedeComer(menu));
	}
}
