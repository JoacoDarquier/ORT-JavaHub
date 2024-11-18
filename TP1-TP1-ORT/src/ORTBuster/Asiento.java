package ORTBuster;

public class Asiento {
	
	private int fila;
	private String letra;
	private Estado estado;
	
	
	public Asiento(int fila, String letra) {
		this.fila = fila;
		this.letra = letra;
		this.estado = estado.LIBRE;
	}


	public int getFila() {
		return fila;
	}


	public void setFila(int fila) {
		this.fila = fila;
	}


	public String getLetra() {
		return letra;
	}


	public void setLetra(String letra) {
		this.letra = letra;
	}


	public Estado getEstado() {
		return estado;
	}


	public void setEstado(Estado estado) {
		this.estado = estado;
	}
	
	
	
	
}
