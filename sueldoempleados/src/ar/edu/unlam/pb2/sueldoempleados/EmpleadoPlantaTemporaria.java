package ar.edu.unlam.pb2.sueldoempleados;

public class EmpleadoPlantaTemporaria extends Empleado{

	public EmpleadoPlantaTemporaria(Integer cantidadDeHorasTrabajadas, Integer cantidadDeHijos, String casado) {
		super(cantidadDeHorasTrabajadas, cantidadDeHijos, casado);
		
	}

	@Override
	public Integer calcularSueldoTotal() {
			
			this.sueldoTotalEmpleado= this.getCantidadDeHorasTrabajadas()*200+this.salarioFamiliar();
			
			
			return this.sueldoTotalEmpleado;
			
	}
	
	

}
