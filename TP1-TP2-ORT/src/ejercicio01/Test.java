package ejercicio01;

public class Test {
	public static void main(String[] args) {
		
		Persona persona = new Persona("Lionel", "Messi");
		
		NumeroTelefonico num1 = new NumeroTelefonico(114111, 2222, 549, TipoDeLinea.CELULAR);
		NumeroTelefonico num2 = new NumeroTelefonico(32444, 5678, 68, TipoDeLinea.CELULAR);
		NumeroTelefonico num3 = new NumeroTelefonico(4411, 5472, 54, TipoDeLinea.FIJO);
		
		EMail email = new EMail("lio", "gmail");
		
		
		persona.agregarNumero(num1);
		persona.agregarNumero(num2);
		persona.agregarNumero(num3);
		
		persona.agregarEmail(email);
		
		persona.mostrarTodo();
		
		
	}
}
