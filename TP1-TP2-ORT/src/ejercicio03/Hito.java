package ejercicio03;

import java.util.ArrayList;

public class Hito {

	private String fecha;
	private String descripcion;
	private ArrayList<Persona> personasInvolucradas;
	
	
	public Hito(String fecha, String descripcion) {
		this.fecha = fecha;
		this.descripcion = descripcion;
		this.personasInvolucradas = new ArrayList<Persona>();
	}

	
	public void getValor () {
		System.out.println(getFecha() + "\n" + getDescripcion());
		if ( !personasInvolucradas.isEmpty() ) {
			System.out.println("Integrantes:");
			for ( Persona persona : personasInvolucradas ) {
				persona.getNombreCompleto();
			}
		}
	}
	
	
	public void agregarPersonas (Persona persona) {
		personasInvolucradas.add(persona);
	}
	
	

	public String getFecha() {
		return fecha;
	}


	public void setFecha(String fecha) {
		this.fecha = fecha;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	public ArrayList<Persona> getPersonasInvolucradas() {
		return personasInvolucradas;
	}


	public void setPersonasInvolucradas(ArrayList<Persona> personasInvolucradas) {
		this.personasInvolucradas = personasInvolucradas;
	}
	
	
	
	
}
