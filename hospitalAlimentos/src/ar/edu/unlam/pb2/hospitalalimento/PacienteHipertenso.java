package ar.edu.unlam.pb2.hospitalalimento;

public class PacienteHipertenso extends PacienteGeneral{

	@Override
	public Boolean puedeComer(Menu menu) {
		
		if(menu.ingredientes.contains("sal")) {
			
			return false;
		}
		
		return true;
	}
	
	

}
