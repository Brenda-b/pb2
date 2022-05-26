package ar.edu.unlam.pb2.sueldoempleados;

public class EmpleadoPlantaPermanente extends Empleado{
	protected Integer añosDeAntiguedad;
	
	public EmpleadoPlantaPermanente(Integer cantidadDeHorasTrabajadas, Integer cantidadDeHijos, String casado, Integer añosDeAntiguedad) {
		super(cantidadDeHorasTrabajadas, cantidadDeHijos, casado);
		
		this.añosDeAntiguedad = añosDeAntiguedad;
	}

	@Override
	public Integer calcularSueldoTotal() {
		
		this.sueldoTotalEmpleado= this.getCantidadDeHorasTrabajadas()*300+ this.añosDeAntiguedad*100+this.salarioFamiliar();
		
		
		return this.sueldoTotalEmpleado;
		
		

	}
	
	
	
	
	


}
