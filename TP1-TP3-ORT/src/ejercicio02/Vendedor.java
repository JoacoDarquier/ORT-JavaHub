package ejercicio02;

public class Vendedor extends SubContratado{
	
	private float porcentaje;
	
	public Vendedor(String nombre, int edad, float cantHoras, float precioHora, float porcentaje) {
		super(nombre, edad, cantHoras, precioHora);
		this.porcentaje = porcentaje;
	}

	
	@Override
	public float calcularPago () {
		return super.calcularPago()  + ((porcentaje * super.calcularPago()) /100);
		
	}
		
}
