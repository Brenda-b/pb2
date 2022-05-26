package ar.edu.unlam.pb2.hospitalalimento;

public class PacienteOncologico extends PacienteGeneral{

	@Override
	public Boolean puedeComer(Menu menu) {
		
		if(menu.proceso.equals("sin coccion")) {
			
			return false;
		}
		
		return true;
		
	}
	
	

}
