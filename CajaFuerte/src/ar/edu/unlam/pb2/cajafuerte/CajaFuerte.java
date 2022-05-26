package ar.edu.unlam.pb2.cajafuerte;

public class CajaFuerte {
	
	Boolean estaAbierta = true;
	private Integer codigoDeApertura;
	
	public Boolean estaAbierta() {
		return estaAbierta;
	}
	
	//public void cerrar() {
		//this.estaAbierta() = false;
	//}
	
	public void abrir (Integer codigoDeApertura) {
		
		if(this.codigoDeApertura.equals(codigoDeApertura)) {
			this.estaAbierta = Boolean.TRUE;
			
		}
	}
	
	public void cerrar (Integer codigoDeApertura) {
		
		this.codigoDeApertura = codigoDeApertura;
		this.estaAbierta = Boolean.FALSE;
	
	}
}
