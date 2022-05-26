package ar.edu.unlam.pb2.sueldoempleados;

import org.junit.Assert;
import org.junit.Test;



public class EmpleadoTest {
	
	@Test
	 
	public void empleadoPlantaTemporariaSinHijos() {
		
		EmpleadoPlantaTemporaria empleadoTemporal = new EmpleadoPlantaTemporaria(80, 0, "si");
		
		Integer sueldoTotalEsperado = 16100;
		
		Assert.assertEquals(sueldoTotalEsperado, empleadoTemporal.calcularSueldoTotal());
		
		
	}
	
	@Test
	 
	public void empleadoPlantaPermanenteConHijos() {
		
		EmpleadoPlantaPermanente empleadoPermanente = new EmpleadoPlantaPermanente(80, 2, "si", 6);
		
		Integer sueldoTotalEsperado = 25100;
		
		Assert.assertEquals(sueldoTotalEsperado, empleadoPermanente.calcularSueldoTotal());
		
		
	}
	
	@Test
	 
	public void empleadoPlantaPermanenteSinHijos() {
		
		EmpleadoPlantaPermanente empleadoPermanente = new EmpleadoPlantaPermanente(160, 0, "no", 4);
		
		Integer sueldoTotalEsperado = 48400;
		
		Assert.assertEquals(sueldoTotalEsperado, empleadoPermanente.calcularSueldoTotal());
		
		
	}
	
	@Test
	 
	public void gerenteSueldo() {
		
		Gerente gerente = new Gerente(160, 1, "si", 10);
		
		Integer sueldoTotalEsperado = 65800;
		
		Assert.assertEquals(sueldoTotalEsperado, gerente.calcularSueldoTotal());
		
		
	}

}
