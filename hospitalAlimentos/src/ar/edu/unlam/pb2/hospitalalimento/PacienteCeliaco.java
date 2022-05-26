package ar.edu.unlam.pb2.hospitalalimento;

import java.util.ArrayList;

public class PacienteCeliaco extends PacienteGeneral{

	@Override
	public Boolean puedeComer(Menu menu) {
		
		ArrayList <String> ingredientesQueNo = new ArrayList<String>();
		
		ingredientesQueNo.add("trigo");
		ingredientesQueNo.add("cebada");
		ingredientesQueNo.add("centeno");
		ingredientesQueNo.add("avena");
		
		
		if(menu.ingredientes.containsAll(ingredientesQueNo)) {
			
			return false;
		}
		
		return true;
		
	}
	
	

}
