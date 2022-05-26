package ar.edu.unlam.pb2.hospitalalimento;

public class PacienteGeneral {
	
	protected String nombrePaciente;
	
	public Boolean puedeComer(Menu menu) {
		
		return true;
	}

	public String getNombrePaciente() {
		return nombrePaciente;
	}

	public void setNombrePaciente(String nombrePaciente) {
		this.nombrePaciente = nombrePaciente;
	}
	
	
	
	
}
