package ar.edu.unlam.pb2.hospitalalimento;

import java.time.LocalDateTime;
import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;

public class PacienteDiabeticoTipo2Test {

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
	
		PacienteDiabeticoTipo2 pacienteDiabeticoTipo2 = new PacienteDiabeticoTipo2();
	
		ingredientes.add("azucar");
	
		Assert.assertFalse(pacienteDiabeticoTipo2.puedeComer(menu));
	}

		@Test
		
		public void cuandoVerificamosQueRecibioInsulina() {
			
			PacienteDiabeticoTipo2 pacienteDiabeticoTipo2 = new PacienteDiabeticoTipo2();
		
			pacienteDiabeticoTipo2.administrarInsulina(); 
		
			Assert.assertTrue(pacienteDiabeticoTipo2.recibioInsulina());
		}
		
@Test
		
		public void cuandoNoRecibioInsulina() {
			
			PacienteDiabeticoTipo2 pacienteDiabeticoTipo2 = new PacienteDiabeticoTipo2();
			
			LocalDateTime ultimaDosisDeInsulina = LocalDateTime.now().minusDays(2);
			
			pacienteDiabeticoTipo2.setUltimaDosisDeInsulina(ultimaDosisDeInsulina);
			
			pacienteDiabeticoTipo2.administrarInsulina(); 
		
			Assert.assertTrue(pacienteDiabeticoTipo2.recibioInsulina());
		}
		
		
		
		
	
}
