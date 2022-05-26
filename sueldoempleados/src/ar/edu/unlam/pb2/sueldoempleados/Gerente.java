package ar.edu.unlam.pb2.sueldoempleados;

public class Gerente extends EmpleadoPlantaPermanente{


	public Gerente(Integer cantidadDeHorasTrabajadas, Integer cantidadDeHijos, String casado,
			Integer a�osDeAntiguedad) {
		super(cantidadDeHorasTrabajadas, cantidadDeHijos, casado, a�osDeAntiguedad);
	}

	@Override
	public Integer calcularSueldoTotal() {
		
			
			this.sueldoTotalEmpleado= this.getCantidadDeHorasTrabajadas()*400+ this.a�osDeAntiguedad*150+this.salarioFamiliar();
			
			
			return this.sueldoTotalEmpleado;
			
	}

	
}
