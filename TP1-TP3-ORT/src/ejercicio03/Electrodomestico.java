package ejercicio03;

public abstract class Electrodomestico {
	
	private String marca;
	private String modelo;
	private int nroDeSerie;
	private int voltaje;
	private boolean encendido;
	private double precio;
	
	
	public Electrodomestico(String marca, String modelo, int nroDeSerie, int voltaje, boolean encendido, double precio) {
		this.marca = marca;
		this.modelo = modelo;
		this.nroDeSerie = nroDeSerie;
		this.voltaje = voltaje;
		this.encendido = encendido;
		this.precio = precio;
	}
	

	public abstract String getDetalleEspecifico();

	
	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	public int getNroDeSerie() {
		return nroDeSerie;
	}


	public void setNroDeSerie(int nroDeSerie) {
		this.nroDeSerie = nroDeSerie;
	}


	public int getVoltaje() {
		return voltaje;
	}


	public void setVoltaje(int voltaje) {
		this.voltaje = voltaje;
	}


	public boolean isEncendido() {
		return encendido;
	}


	public void setEncendido(boolean encendido) {
		this.encendido = encendido;
	}


	public double getPrecio() {
		return precio;
	}


	public void setPrecio(double precio) {
		this.precio = precio;
	}


	@Override
	public String toString() {
		return this.getClass().getSimpleName() + ", " + getMarca() + ", modelo " + getModelo() + ", " + getDetalleEspecifico() + " $" + getPrecio();
	}
	

}
