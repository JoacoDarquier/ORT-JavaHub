package ejercicio05;

import java.util.ArrayList;

public class Edificio {
	
	private ArrayList<Vivienda> viviendas;
	

	public Edificio() {
		this.viviendas = new ArrayList<Vivienda>();
	}


	public void realizarMudanza (int pisoOrigen, String departamentoOrigen, int pisoNuevo, String departamentoNuevo) {
		Vivienda origen = buscarVivienda(pisoOrigen, departamentoOrigen);
		Vivienda destino = buscarVivienda(pisoNuevo, departamentoNuevo);
		
		if ( origen != null && destino != null ) {
			destino.getPersonas().addAll(origen.getPersonas());
			destino.getMuebles().addAll(origen.getMuebles());
			
			origen.getPersonas().clear();
			origen.getMuebles().clear();
			
			System.out.println("SE HA REALIZADO LA MUDANZA DE VIVIENDA 1 A VIVIENDA 2");
		} else {
			System.out.println("Mudanza no realizada: una o ambas viviendas no existen.");
		}
	}
	
	
	private Vivienda buscarVivienda (int piso, String departamento) {
		for ( Vivienda vivienda : viviendas ) {
			if ( vivienda.getDireccion().getPiso() == piso && vivienda.getDireccion().getDepartamento().equals(departamento) ) {
				return vivienda;
			}
		}
		return null;
	}
	
	
	public void agregarVivienda (Vivienda vivienda) {
		viviendas.add(vivienda);
	}

	
	public void mostrarTodo() {
        int contador = 1;
        for (Vivienda vivienda : viviendas) {
            System.out.println("Vivienda " + contador + ":");
            vivienda.mostrarVivienda();
            contador++;
        }
    }
	
	
}
