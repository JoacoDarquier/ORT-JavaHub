package ejercicio02;

import java.util.ArrayList;

public class Carrera {
	
	private String nombre;
	private ArrayList<Atleta> atletas;
	
	
	
	public Carrera(String nombre) {
		this.nombre = nombre;
		this.atletas = new ArrayList<>();
	}


	public void agregarAtleta (Atleta atleta) {
		atletas.add(atleta);
	}
	
	
	public ArrayList<Atleta> ganadores() {
		ArrayList<Atleta> ganadores = new ArrayList<Atleta>();
		double mejorTiempo = atletas.get(0).getTiempo();
		
		for ( Atleta atleta : atletas ) {
			if ( atleta.getTiempo() > mejorTiempo ) {
				ganadores.clear();
				ganadores.add(atleta);
				mejorTiempo = atleta.getTiempo();
			} else if ( atleta.getTiempo() == mejorTiempo ) {
				ganadores.add(atleta);
			}
		}
		
		return ganadores;
	}


	public String getNombre() {
		return nombre;
	}
	
}