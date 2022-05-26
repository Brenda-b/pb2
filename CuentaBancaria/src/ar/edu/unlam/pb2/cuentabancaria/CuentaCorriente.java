package ar.edu.unlam.pb2.cuentabancaria;

public class CuentaCorriente extends CuentaSueldo{
	
	protected Double montoDescubierto;//limite que impone el banco
	
	Integer numeroDeCuentaBancaria= 3;

	String motivoPorDeposito= "Algo";
	
	public CuentaCorriente(Integer id) {
		super(id); 
		
	}

	@Override
	public Boolean extraer(Double SALDO_A_EXTRAER,Integer id, String motivo) {
		if(SALDO_A_EXTRAER<= this.saldoActual) {
			this.saldoActual -= SALDO_A_EXTRAER;
			 
			
			return true;
		}else { 
			Double saldoMasDescubierto = this.saldoActual + montoDescubierto; 
			
			if( SALDO_A_EXTRAER <= saldoMasDescubierto) {
			
				
				this.saldoActual= (this.saldoActual-SALDO_A_EXTRAER)*0.05;
			
				return true;
			}
			
			return false;
		}
		
	}

	public Double getMontoDescubierto() {
		return montoDescubierto;
	}

	public void setMontoDescubierto(Double montoDescubierto) {
		this.montoDescubierto = montoDescubierto;
	}

	
	
	
}
	
	

