package ejercicio03;

import java.util.ArrayList;

public class Tienda {
	
	private ArrayList<Electrodomestico> articulos;

	
	public Tienda() {
		this.articulos = new ArrayList<Electrodomestico>();
	}
	
	
	public void agregarElectrodomestico(Electrodomestico e) {
		this.articulos.add(e);
	}
	
	
	public void imprimirProductos() {
		for (Electrodomestico electrodomestico : articulos) {
			System.out.println(electrodomestico);
		}
	}
	
	
}
