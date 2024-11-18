package ejercicio02;

public class Mascota {
	
	private String nombre;
	private String tipoDeAminal;
	
	
	public Mascota(String nombre, String tipoDeAminal) {
		this.nombre = nombre;
		this.tipoDeAminal = tipoDeAminal;
	}


	public void getValor () {
		System.out.println(getTipoDeAminal() + ", " + getNombre());
	}
	
	
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getTipoDeAminal() {
		return tipoDeAminal;
	}


	public void setTipoDeAminal(String tipoDeAminal) {
		this.tipoDeAminal = tipoDeAminal;
	}
	
	
	
	
}
