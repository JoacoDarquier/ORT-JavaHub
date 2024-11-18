package ejercicio01;

public class Test {
	public static void main(String[] args) {
		
		Empleado empleado1 = new Asalariado("Jose", 30, 10000);
		Empleado empleado2 = new SubContratado("Carlos", 23, 50, 100);
		
		
		System.out.println(empleado1);
		System.out.println(empleado2);
		
	}
}
