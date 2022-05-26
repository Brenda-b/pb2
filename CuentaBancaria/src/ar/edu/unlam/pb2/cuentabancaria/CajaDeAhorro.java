package ar.edu.unlam.pb2.cuentabancaria;

public class CajaDeAhorro extends CuentaSueldo {
	
	private Integer numeroDeExtracciones ;

	public CajaDeAhorro(Integer id) {
		super(id);
		
	}

	public Integer getNumeroDeExtracciones() {
		return numeroDeExtracciones;
	}

	public void setNumeroDeExtracciones(Integer numeroDeExtracciones) {
		this.numeroDeExtracciones = numeroDeExtracciones;
	}

	@Override
	public Boolean extraer(Double SALDO_A_EXTRAER,Integer id, String motivo) {
		if (SALDO_A_EXTRAER <= this.saldoActual && this.numeroDeExtracciones < 5) {
			
			this.saldoActual -= SALDO_A_EXTRAER;
			
			this.numeroDeExtracciones++;
			
			System.out.println("extracciones menos que 5");
			return true;
		} else {
			if (this.numeroDeExtracciones >= 5 && SALDO_A_EXTRAER+6 <= this.saldoActual) {
				
				this.saldoActual -= (SALDO_A_EXTRAER+6);
				
				this.numeroDeExtracciones++;
				
				return true;
			}
			
			
		}
		
		return false;
	}
	
	
}
