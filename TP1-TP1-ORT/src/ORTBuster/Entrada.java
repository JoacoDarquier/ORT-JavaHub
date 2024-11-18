package ORTBuster;

public class Entrada {

	private String dia;
	private String hora;
	private int fila;
	private String letra;
	
	
	public Entrada(String dia, String hora, int fila, String letra) {
		this.dia = dia;
		this.hora = hora;
		this.fila = fila;
		this.letra = letra;
	}
	
	
	public String getDia() {
		return dia;
	}
	public void setDia(String dia) {
		this.dia = dia;
	}
	public String getHora() {
		return hora;
	}
	public void setHora(String hora) {
		this.hora = hora;
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
	
}
