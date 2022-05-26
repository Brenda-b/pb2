package ar.edu.unlam.pb2.sueldoempleados;

public class Gerente extends EmpleadoPlantaPermanente{


	public Gerente(Integer cantidadDeHorasTrabajadas, Integer cantidadDeHijos, String casado,
			Integer añosDeAntiguedad) {
		super(cantidadDeHorasTrabajadas, cantidadDeHijos, casado, añosDeAntiguedad);
	}

	@Override
	public Integer calcularSueldoTotal() {
		
			
			this.sueldoTotalEmpleado= this.getCantidadDeHorasTrabajadas()*400+ this.añosDeAntiguedad*150+this.salarioFamiliar();
			
			
			return this.sueldoTotalEmpleado;
			
	}

	
}
