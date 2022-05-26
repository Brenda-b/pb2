package ar.edu.unlam.pb2.sueldoempleados;

public class EmpleadoPlantaPermanente extends Empleado{
	protected Integer a�osDeAntiguedad;
	
	public EmpleadoPlantaPermanente(Integer cantidadDeHorasTrabajadas, Integer cantidadDeHijos, String casado, Integer a�osDeAntiguedad) {
		super(cantidadDeHorasTrabajadas, cantidadDeHijos, casado);
		
		this.a�osDeAntiguedad = a�osDeAntiguedad;
	}

	@Override
	public Integer calcularSueldoTotal() {
		
		this.sueldoTotalEmpleado= this.getCantidadDeHorasTrabajadas()*300+ this.a�osDeAntiguedad*100+this.salarioFamiliar();
		
		
		return this.sueldoTotalEmpleado;
		
		

	}
	
	
	
	
	


}
