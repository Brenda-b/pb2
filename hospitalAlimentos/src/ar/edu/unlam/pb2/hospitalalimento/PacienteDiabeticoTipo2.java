package ar.edu.unlam.pb2.hospitalalimento;

import java.time.LocalDateTime;

public class PacienteDiabeticoTipo2 extends PacienteDiabetico{

	
	private LocalDateTime ultimaDosisDeInsulina;
	
	public Boolean recibioInsulina() {
		
		
		if(this.ultimaDosisDeInsulina.getDayOfMonth() == LocalDateTime.now().getDayOfMonth()) {
			
			return true;
		}
		
		return false;
		
	}
	
	public void administrarInsulina() {
		
		
		
		if(this.ultimaDosisDeInsulina== null || this.recibioInsulina() == false ) {
			
			this.ultimaDosisDeInsulina = LocalDateTime.now();
		}
		
	}

	public LocalDateTime getUltimaDosisDeInsulina() {
		return ultimaDosisDeInsulina;
	}

	public void setUltimaDosisDeInsulina(LocalDateTime ultimaDosisDeInsulina) {
		this.ultimaDosisDeInsulina = ultimaDosisDeInsulina;
	}
	
	
	
}
