package ar.edu.unlam.pb2.sueldoempleados;

public class Empleado {

	protected Integer cantidadDeHorasTrabajadas;
	protected Integer cantidadDeHijos;
	protected String casado;
	protected Integer salarioFamiliar;
	protected Integer sueldoTotalEmpleado;
	
	
	public  Integer salarioFamiliar(){
		
		 this.salarioFamiliar = this.cantidadDeHijos*200;	
		
		if (this.casado == "si") {
			
			this.salarioFamiliar = this.salarioFamiliar + 100 ;
			
			return this.salarioFamiliar;
		}
		
		return this.salarioFamiliar;
		
		
	}


	public Empleado(Integer cantidadDeHorasTrabajadas, Integer cantidadDeHijos, String casado) {
		
		this.setCantidadDeHorasTrabajadas(cantidadDeHorasTrabajadas);
		this.cantidadDeHijos = cantidadDeHijos;
		this.casado = casado;
		
		
	}
	
	public Integer calcularSueldoTotal() {
		return sueldoTotalEmpleado;
		
	}


	public Integer getCantidadDeHorasTrabajadas() {
		return cantidadDeHorasTrabajadas;
	}


	public void setCantidadDeHorasTrabajadas(Integer cantidadDeHorasTrabajadas) {
		this.cantidadDeHorasTrabajadas = cantidadDeHorasTrabajadas;
	}


	
	
	
}
