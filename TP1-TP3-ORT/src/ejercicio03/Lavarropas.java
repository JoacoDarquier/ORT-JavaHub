package ejercicio03;

public class Lavarropas extends Electrodomestico{
	
	private int cargaMaxima;
	private boolean semiAutomatico;
	
	
	public Lavarropas(String marca, String modelo, int nroDeSerie, int voltaje, boolean encendido, double precio, int cargaMaxima, boolean semiAutomatico) {
		super(marca, modelo, nroDeSerie, voltaje, encendido, precio);
		this.cargaMaxima = cargaMaxima;
		this.semiAutomatico = semiAutomatico;
	}

	
	@Override
	public String getDetalleEspecifico() {
		return getCargaMaxima() + ", automático: " + isSemiAutomatico() ;
	}
	
	
	public int getCargaMaxima() {
		return cargaMaxima;
	}

	public void setCargaMaxima(int cargaMaxima) {
		this.cargaMaxima = cargaMaxima;
	}

	public boolean isSemiAutomatico() {
		return semiAutomatico;
	}

	public void setSemiAutomatico(boolean semiAutomatico) {
		this.semiAutomatico = semiAutomatico;
	}
	
	
}
