package ejercicio03;

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
			if ( atleta.getTiempo() < mejorTiempo ) {
				ganadores.clear();
				ganadores.add(atleta);
				mejorTiempo = atleta.getTiempo();
			} else if ( atleta.getTiempo() == mejorTiempo ) {
				ganadores.add(atleta);
			}
		}
		
		return ganadores;
	}

	
	public ArrayList<Posicion> getTernaGanadores() {
		ArrayList<Posicion> ternaGanadora = new ArrayList<Posicion>();
		Posicion p1 = new Posicion();
		Posicion p2 = new Posicion();
		Posicion p3 = new Posicion();
		int j;
		Atleta atleta;
		double primero = 9999;
		double segundo = 9999;
		double tercero = 9999;

		if (atletas.size() > 0 ) {
			//Busco los 3 mejores tiempos
			for (int i = 0; i < atletas.size(); i++) {
				atleta = atletas.get(i);
				j = 0; 			
				
				if (atletas.get(i).getTiempo()< primero){
					tercero = segundo;
					segundo = primero;
					primero = atletas.get(i).getTiempo();
				}else{
					if(atletas.get(i).getTiempo()> primero && atletas.get(i).getTiempo()<= segundo){
						tercero = segundo;
						segundo = atletas.get(i).getTiempo();
					}else{
						if(atletas.get(i).getTiempo()> segundo && atletas.get(i).getTiempo()<= tercero){
							tercero = atletas.get(i).getTiempo();
						}
					}
				}
			}
			p1.setTiempo(primero);
			p2.setTiempo(segundo);
			p3.setTiempo(tercero);
			
			ternaGanadora.add(p1);
			ternaGanadora.add(p2);
			ternaGanadora.add(p3);

			//Pongo los atletas en las posiciones correspondientes
			for (int i = 0; i < atletas.size();i++) {
				for(j = 0; j<ternaGanadora.size();j++){
					if (atletas.get(i).getTiempo() == ternaGanadora.get(j).getTiempo()){
						ternaGanadora.get(j).agregarAtleta(atletas.get(i));
					}
				}
			}
		}
		return ternaGanadora;
	}
	
	
	public String getNombre() {
		return nombre;
	}
	
}