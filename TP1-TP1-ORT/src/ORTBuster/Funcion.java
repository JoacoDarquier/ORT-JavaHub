package ORTBuster;

import java.util.ArrayList;

public class Funcion {
	
	private String dia;
	private String horaDeInicio;
	private ArrayList<Asiento> asientos;
	
	
	public Funcion(String dia, String horaDeInicio) {
		this.dia = dia;
		this.horaDeInicio = horaDeInicio;
		this.asientos = new ArrayList<Asiento>();
	}


	public String getDia() {
		return dia;
	}


	public void setDia(String dia) {
		this.dia = dia;
	}


	public String getHoraDeInicio() {
		return horaDeInicio;
	}


	public void setHoraDeInicio(String horaDeInicio) {
		this.horaDeInicio = horaDeInicio;
	}


	public ArrayList<Asiento> getAsientos() {
		return asientos;
	}


	public void setAsientos(ArrayList<Asiento> asientos) {
		this.asientos = asientos;
	}
	
	
	
	
	
}
