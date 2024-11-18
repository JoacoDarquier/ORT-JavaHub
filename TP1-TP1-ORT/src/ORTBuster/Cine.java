package ORTBuster;

import java.util.ArrayList;

public class Cine {

	private ArrayList<Funcion> funciones;
	private ArrayList<Entrada> entradas;
	
	
	public Cine() {
		this.funciones = new ArrayList<Funcion>();
		this.entradas = new ArrayList<Entrada>();
	}
	
	
	public boolean procesarEntradas ( ArrayList<Entrada> entradasAProcesar ) {
		
		if ( entradasAProcesar == null || entradasAProcesar.isEmpty() ) {
			return false;
		}
		
		for ( Entrada entrada : entradasAProcesar ) {
			Funcion funcionCorrespondiente = buscarFuncion(entrada.getDia(), entrada.getHora());
			if ( funcionCorrespondiente == null ) {
				return false;
			}
			
			Asiento asientoCorrespondiete = buscarAsiento (funcionCorrespondiente, entrada.getFila(), entrada.getLetra() );
			if ( asientoCorrespondiete == null || asientoCorrespondiete.getEstado() != Estado.RESERVADO ) {
				return false;
			}
		}
		
		for (Entrada entrada : entradasAProcesar) {
            Funcion funcionCorrespondiente = buscarFuncion(entrada.getDia(), entrada.getHora());
            Asiento asientoCorrespondiente = buscarAsiento(funcionCorrespondiente, entrada.getFila(), entrada.getLetra());
            
            asientoCorrespondiente.setEstado(Estado.CUMPLIDO);
        }
		
		return true;
	}
	
	
	private Funcion buscarFuncion (String dia, String hora) {
		for ( Funcion funcion : funciones ) {
			if ( funcion.getDia().equals(dia) && funcion.getHoraDeInicio().equals(hora) ) {
				return funcion;
			}
		}
		return null;
	}
	
	
	private Asiento buscarAsiento (Funcion funcion, int fila, String letra) {
		for (Asiento asiento : funcion.getAsientos()) {
			if ( asiento.getFila() == fila && asiento.getLetra().equals(letra) ) {
				return asiento;
			}
		}
		return null;
	}
	
	
}
