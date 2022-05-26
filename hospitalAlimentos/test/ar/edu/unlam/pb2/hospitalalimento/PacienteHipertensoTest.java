package ar.edu.unlam.pb2.hospitalalimento;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;

public class PacienteHipertensoTest {
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
		
		PacienteHipertenso pacienteHipertenso = new PacienteHipertenso();
		
		ingredientes.add("sal");
		
		Assert.assertFalse(pacienteHipertenso.puedeComer(menu));
	}

}
