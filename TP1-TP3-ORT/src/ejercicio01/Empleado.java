package ejercicio01;

public abstract class Empleado {
	
	private String nombre;
	private int edad;
	
	
	public Empleado(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}

	
	public abstract float calcularPago();
	
	
	@Override
	public String toString () {
		return this.getClass().getSimpleName() + " " + getNombre() + " gana: " + calcularPago();
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	
}
