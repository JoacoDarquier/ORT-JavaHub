package ejercicio01;

import java.util.ArrayList;

public class Persona {
	
	private String nombre;
	private String apellido;
	private ArrayList<NumeroTelefonico> numeros;
	private ArrayList<EMail> emails;
	
	
	public Persona(String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.numeros = new ArrayList<NumeroTelefonico>();
		this.emails = new ArrayList<EMail>();
	}

	
	public void mostrarTodo () {
		getNombreCompleto();
		
		if ( !numeros.isEmpty() ) {
			System.out.println("Telefonos:");
			for ( NumeroTelefonico numero : numeros ) {
				System.out.println(numero.getTipoDeLinea() + ": " + numero.getValor());
			}
		}
		
		for ( EMail email : emails ) {
			System.out.println("Email:");
			email.getValor();		
		}
		
	}
	
	
	private void getNombreCompleto () {
		System.out.println(getApellido() + ", " + getNombre());
	}
	
	
	public void agregarNumero (NumeroTelefonico num) {
		numeros.add(num);
	}
	
	
	public void agregarEmail (EMail email) {
		emails.add(email);
	}
	

	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public ArrayList<NumeroTelefonico> getNumeros() {
		return numeros;
	}


	public void setNumeros(ArrayList<NumeroTelefonico> numeros) {
		this.numeros = numeros;
	}


	public ArrayList<EMail> getEmails() {
		return emails;
	}


	public void setEmails(ArrayList<EMail> emails) {
		this.emails = emails;
	}
	
	
	
	
	

}
