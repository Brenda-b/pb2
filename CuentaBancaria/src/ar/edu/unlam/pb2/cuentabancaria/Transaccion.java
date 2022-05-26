package ar.edu.unlam.pb2.cuentabancaria;

import java.time.LocalDateTime;

public class Transaccion {
	
	private Integer id;
	private Double monto;
	private String motivo;
	private LocalDateTime fecha;
	
	
	
	public Transaccion(Integer id, Double monto, String motivo, LocalDateTime fecha) {
		super();
		this.id = id;
		this.monto = monto;
		this.motivo = motivo;
		this.fecha = fecha;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Double getMonto() {
		return monto;
	}
	public void setMonto(Double monto) {
		this.monto = monto;
	}
	public String getMotivo() {
		return motivo;
	}
	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}
	public LocalDateTime getFecha() {
		return fecha;
	}
	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}
	
	

}
