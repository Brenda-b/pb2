package ar.edu.unlam.pb2.hospitalalimento;

import java.util.ArrayList;
import org.junit.Assert;
import org.junit.Test;

public class PacienteGeneralTest {

	
	
	@Test
	
	public void cuandoCreoUnMenu(){

		ArrayList <String> ingredientes = new ArrayList<String>() ;
		
		Menu menu = new Menu("menu general", "frito", ingredientes);
		
		Assert.assertEquals(Menu.class, menu.getClass());
		
	}
	
	
}
