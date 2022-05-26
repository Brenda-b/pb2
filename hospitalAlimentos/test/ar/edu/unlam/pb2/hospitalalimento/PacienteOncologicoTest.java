package ar.edu.unlam.pb2.hospitalalimento;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;

public class PacienteOncologicoTest {

@Test
	
	public void cuandoCreoUnMenu() {
		
		ArrayList <String> ingredientes = new ArrayList<String>() ;
		
		Menu menu = new Menu("menu general", "frito", ingredientes);
		
		Assert.assertEquals(Menu.class, menu.getClass());
	}
	
	@Test
	
	public void CuandoHayUnIngredienteQueNoPuedeComer() {
		
		ArrayList <String> ingredientes = new ArrayList<String>();
		 
		Menu menu= new Menu("menu general", "sin coccion", ingredientes);
		
		PacienteOncologico pacienteOncologico = new PacienteOncologico();
		
		Assert.assertFalse(pacienteOncologico.puedeComer(menu));
	}

}
