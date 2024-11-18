package ejercicio03;

public class Televisor extends Electrodomestico{
	
	private int dimension;
	private boolean isSmart;
	
	
	public Televisor(String marca, String modelo, int nroDeSerie, int voltaje, boolean encendido, double precio, int dimension, boolean isSmart) {
		super(marca, modelo, nroDeSerie, voltaje, encendido, precio);
		this.dimension = dimension;
		this.isSmart = isSmart;
	}


	@Override
	public String getDetalleEspecifico() {
		return getDimension() + ", " + isSmart();
	}
	
	
	public int getDimension() {
		return dimension;
	}


	public void setDimension(int dimension) {
		this.dimension = dimension;
	}


	public boolean isSmart() {
		return isSmart;
	}


	public void setSmart(boolean isSmart) {
		this.isSmart = isSmart;
	}

	
}
