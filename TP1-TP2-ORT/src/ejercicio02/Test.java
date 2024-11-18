package ejercicio02;

public class Test {
	public static void main(String[] args) {
		
		Persona persona = new Persona("Lionel", "Messi");
		
		NumeroTelefonico num1 = new NumeroTelefonico(114111, 2222, 549, TipoDeLinea.CELULAR);
		NumeroTelefonico num2 = new NumeroTelefonico(32444, 5678, 68, TipoDeLinea.CELULAR);
		NumeroTelefonico num3 = new NumeroTelefonico(4411, 5472, 54, TipoDeLinea.FIJO);
		
		EMail email = new EMail("lio", "gmail");
		EMail email2 = new EMail("liogo", "madrid");
		EMail email3 = new EMail("liomessi_newells", "hotmail");
		
		Mascota mas1 = new Mascota("Pluto", "Perro");
		Mascota mas2 = new Mascota("Felix", "Gato");
		Mascota mas3 = new Mascota("Bugs", "Conejo");
		
		
		
		persona.agregarNumero(num1);
		persona.agregarNumero(num2);
		persona.agregarNumero(num3);
		
		persona.agregarEmail(email);
		persona.agregarEmail(email2);
		persona.agregarEmail(email3);
		persona.eliminarEmail(email2);
		
		
		persona.agregarMascota(mas1);
		persona.agregarMascota(mas2);
		persona.agregarMascota(mas3);
		
		persona.mostrarTodo();
		
		
	}
}
