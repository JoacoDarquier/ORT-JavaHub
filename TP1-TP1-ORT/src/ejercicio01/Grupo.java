package ejercicio01;

import java.util.ArrayList;


public class Grupo {
	
	
	private String nombre;
	private ArrayList<String> integrantes;
	
	
	public Grupo(String nombre) {
		this.nombre = nombre;
		this.integrantes = new ArrayList<>();
	}

	public int getCantidadIntegrantes () {
		return integrantes.size();
	}
	
	public void agregarIntegrante(String nombreIntegrante) {
		if ( !integrantes.contains(nombreIntegrante) ) {
			integrantes.add(nombreIntegrante);
			System.out.println(nombreIntegrante + " ha sido agregado al grupo.");
		} else {
			System.out.println(nombreIntegrante + " ya está en el grupo.");
		}		
	}
	
	public int obtenerPosicionIntegrante (String nombreIntegrante) {
		return integrantes.indexOf(nombreIntegrante);
	}
	
	 public String obtenerIntegrante(int posicion) {
		 if ( integrantes.size() <= posicion) {
			 return integrantes.get(posicion);
		 } else {
			 return null;
		 }
	 }
	 
//	 public String obtenerIntegrante(int posicion) {
//		 int indice = posicion - 1; 
//		 if (indice >= 0 && indice < integrantes.size()) {
//			 return integrantes.get(indice); 
//		 } else {
//			 return null;
//		 }
	 
	 public String buscarIntegrante(String nombre) {
		 if ( integrantes.contains(nombre) ) {
			 return nombre + " se encuentra en este grupo";
		 }
		 return nombre + "No se encuentra en este grupo";
	 }
	 
	 public String removerIntegrante(String nombreIntegrante) {
		 if ( integrantes.contains(nombreIntegrante) ) {
			 integrantes.remove(nombreIntegrante);
			 return nombreIntegrante + " Salio del grupo";
		 } else {
			 return "No esta en el grupo...";
		 }
	 }
	 
	 private void mostrarIntegrantes() {
		 if ( integrantes.isEmpty() ) {
			 System.out.println("El grupo no tiene integrantes.");
		 } else {
			 System.out.println("Integrantes del grupo: ");
			 for (String integrante : integrantes) {
				 System.out.println(integrante);
			 }
		 }
	 }
	 
	 public void mostrar() {
		 System.out.println("Grupo: " + getNombre());
		 System.out.println("Cantidad: " + integrantes.size());
		 System.out.println("Integrantes del grupo: ");
		 mostrarIntegrantes();
		 }
	 
	 public void vaciar() {
		 integrantes.clear();
	 }
	 
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
}
