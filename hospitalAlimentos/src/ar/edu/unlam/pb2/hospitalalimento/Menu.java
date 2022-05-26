package ar.edu.unlam.pb2.hospitalalimento;

import java.util.ArrayList;

public class Menu {
	
	protected String nombreMenu;
	protected String proceso;
	protected ArrayList<String> ingredientes;
	
	
	
	
	public Menu(String nombreMenu, String proceso, ArrayList<String> ingredientes) {
		
		this.nombreMenu = nombreMenu;
		
		if(proceso.equals("al horno") || proceso.equals("frito") || proceso.equals("en olla") || proceso.equals("sin coccion") ) {
			this.proceso = proceso;
		
		}else {
			
			this.proceso = "error";
			
		}
		
		
		this.ingredientes = ingredientes;
	}

	public String getNombreMenu() {
		return nombreMenu;
	}
	
	public void setNombreMenu(String nombreMenu) {
		this.nombreMenu = nombreMenu;
	}
	
	public String getProceso() {
		return proceso;
	}
	
	public void setProceso(String proceso) {
		this.proceso = proceso;
	}
	
	public ArrayList<String> getIngredientes() {
		return ingredientes;
	}
	
	public void setIngredientes(ArrayList<String> ingredientes) {
		this.ingredientes = ingredientes;
	}
	
	
}
