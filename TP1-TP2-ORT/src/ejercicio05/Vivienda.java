package ejercicio05;

import java.util.ArrayList;

public class Vivienda {
	
	private Direccion direccion;
	private ArrayList<Persona> personas;
	private ArrayList<Mueble> muebles;
	
	
	public Vivienda(Direccion direccion) {
		this.direccion = direccion;
		this.personas = new ArrayList<Persona>();
		this.muebles = new ArrayList<Mueble>();
	}
	
	
	public void mostrarVivienda () {
		direccion.mostrarDireccion();
		System.out.println("Personas:");
		if ( !personas.isEmpty() ) {
			
			for ( Persona persona : personas ) {
				persona.mostrarPersona();
			}
		}
		System.out.println("Muebles:");
		if ( !muebles.isEmpty() ) {
			
			for (Mueble mueble : muebles) {
				mueble.mostrarMueble();
			}
		}
	}
	
	
	public void agregarPersona (Persona persona) {
		personas.add(persona);
	}
	
	
	public void agregarMueble (Mueble mueble) {
		muebles.add(mueble);
	}


	public Direccion getDireccion() {
		return direccion;
	}


	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}


	public ArrayList<Persona> getPersonas() {
		return personas;
	}


	public void setPersonas(ArrayList<Persona> personas) {
		this.personas = personas;
	}


	public ArrayList<Mueble> getMuebles() {
		return muebles;
	}


	public void setMuebles(ArrayList<Mueble> muebles) {
		this.muebles = muebles;
	}
	
	

}
