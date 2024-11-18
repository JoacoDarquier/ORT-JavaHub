package ejercicio02;

public class Test {
	public static void main(String[] args) {
		
		Empleado empleado1 = new Vendedor("Pedro", 25, 100, 200, 5);
		Empleado empleado2 = new Vendedor("Maria", 30, 100, 200, 10);
		
		
		System.out.println(empleado1.toString());
		System.out.println(empleado2.toString());
		
	}
}