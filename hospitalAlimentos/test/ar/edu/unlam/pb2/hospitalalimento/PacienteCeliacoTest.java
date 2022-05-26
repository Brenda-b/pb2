package ar.edu.unlam.pb2.hospitalalimento;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;

public class PacienteCeliacoTest {

@Test
	
	public void cuandoCreoUnMenu(){

		ArrayList <String> ingredientes = new ArrayList<String>() ;
		
		Menu menu = new Menu("menu general", "frito", ingredientes);
		
		Assert.assertEquals(Menu.class, menu.getClass());
		
		
		
		
	}

@Test

	public void cuandoHayUnIngredienteQueNoPuedeComer() {

		ArrayList <String> ingredientes = new ArrayList<String>() ;
	
		Menu menu = new Menu("menu general", "frito", ingredientes);
	
		PacienteCeliaco pacienteCeliaco = new PacienteCeliaco();
	
		ingredientes.add("trigo");
	
		Assert.assertTrue(pacienteCeliaco.puedeComer(menu));
	}
}
