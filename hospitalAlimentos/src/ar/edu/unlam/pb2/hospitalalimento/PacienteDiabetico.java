package ar.edu.unlam.pb2.hospitalalimento;

public class PacienteDiabetico extends PacienteGeneral{

	@Override
	public Boolean puedeComer(Menu menu) {
		
		if(menu.ingredientes.contains("azucar")) {
			
			return false;
		}
		
		return true;
	}

	
	
}
