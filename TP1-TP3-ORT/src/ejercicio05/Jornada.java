package ejercicio05;

import java.util.ArrayList;

public class Jornada {
	
	private ArrayList<Partido> partidos;
	private int fecha;//1,2...n

	public Jornada() {
		this.partidos = new ArrayList<Partido>();
	}
	
	public Jornada(int fecha) {
		this.fecha = fecha;
		this.partidos = new ArrayList<Partido>();
	}
	
	public void agregarPartido(Partido partido) {
		partidos.add(partido);
	}
	
	public void eliminarPartido(Partido partido) {
		partidos.remove(partido);
	}
	
	public ArrayList<Partido> getPartidos() {
		return partidos;
	}

	public int getFecha() {
		return fecha;
	}

	public void setFecha(int fecha) {
		this.fecha = fecha;
	}
}