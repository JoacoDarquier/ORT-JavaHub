package ejercicio03;

public class Licuadora extends Electrodomestico{
	
	private int potecia;
	private int cantVelocidades;
	
	
	public Licuadora(String marca, String modelo, int nroDeSerie, int voltaje, boolean encendido, double precio, int potecia, int cantVelocidades) {
		super(marca, modelo, nroDeSerie, voltaje, encendido, precio);
		this.potecia = potecia;
		this.cantVelocidades = cantVelocidades;
	}
	
	
	@Override
	public String getDetalleEspecifico() {
		return "potencia: " + getPotecia();
	}
	
	
	public int getPotecia() {
		return potecia;
	}
	public void setPotecia(int potecia) {
		this.potecia = potecia;
	}
	public int getCantVelocidades() {
		return cantVelocidades;
	}
	public void setCantVelocidades(int cantVelocidades) {
		this.cantVelocidades = cantVelocidades;
	}
	
	
}
