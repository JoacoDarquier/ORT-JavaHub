package ejercicio03;

public class Heladera extends Electrodomestico{
	
	private int capacidad;
	private boolean isFrost;
	
	
	public Heladera(String marca, String modelo, int nroDeSerie, int voltaje, boolean encendido, double precio, int capacidad, boolean noFrost) {
		super(marca, modelo, nroDeSerie, voltaje, encendido, precio);
		this.capacidad = capacidad;
		this.isFrost = noFrost;
	}
	
	
	@Override
	public String getDetalleEspecifico() {
		return "capacidad: " + getCapacidad() + " litros, frost: " + isFrost();
	}
	
	
	public int getCapacidad() {
		return capacidad;
	}
	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}
	public boolean isFrost() {
		return isFrost;
	}
	public void setFrost(boolean noFrost) {
		this.isFrost = noFrost;
	}
	

}
