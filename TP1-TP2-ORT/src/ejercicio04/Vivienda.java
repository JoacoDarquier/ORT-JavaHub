package ejercicio04;

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
		System.out.println("Vivienda 1:");
		direccion.mostrarDireccion();
		
		if ( !personas.isEmpty() ) {
			System.out.println("Personas:");
			for ( Persona persona : personas ) {
				persona.mostrarPersona();
			}
		}
		
		if ( !muebles.isEmpty() ) {
			System.out.println("Muebles:");
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
	
	

}
