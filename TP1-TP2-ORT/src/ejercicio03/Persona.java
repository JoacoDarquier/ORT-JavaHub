package ejercicio03;

import java.util.ArrayList;

public class Persona {
	
	private String nombre;
	private String apellido;
	private ArrayList<NumeroTelefonico> numeros;
	private ArrayList<EMail> emails;
	private ArrayList<Mascota> mascotas;
	private ArrayList<Hito> hitos;
	
	
	public Persona(String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.numeros = new ArrayList<NumeroTelefonico>();
		this.emails = new ArrayList<EMail>();
		this.mascotas = new ArrayList<Mascota>();
		this.hitos = new ArrayList<Hito>();
	}

	
	public void mostrarTodo () {
		getNombreCompleto();
		
		if ( !numeros.isEmpty() ) {
			System.out.println("Telefonos:");
			for ( NumeroTelefonico numero : numeros ) {
				System.out.println(numero.getTipoDeLinea() + ": " + numero.getValor());
			}
		}
		
		if ( !emails.isEmpty() ) {
			System.out.println("Emails:");
			for ( EMail email : emails ) {
				email.getValor();		
			}
		}
		
		if ( !mascotas.isEmpty() ) {
			System.out.println("Mascotas: ");
			for ( Mascota mascota : mascotas ) {
				mascota.getValor();
			}
		}
		
		if ( !hitos.isEmpty() ) {
			System.out.println("Hitos: ");
			for ( Hito hito : hitos ) {
				hito.getValor();
			}
		}
		
	}
	
	
	public void getNombreCompleto () {
		System.out.println(getApellido() + ", " + getNombre());
	}
	
	
	public void agregarNumero (NumeroTelefonico num) {
		numeros.add(num);
	}
	
	
	public void eliminarNumero (NumeroTelefonico num) {
		numeros.remove(num);
	}
	
	
	public void agregarEmail (EMail email) {
		emails.add(email);
	}
	
	
	public void eliminarEmail (EMail email) {
		emails.remove(email);
	}

	public void agregarMascota (Mascota mascota) {
		mascotas.add(mascota);
	}
	
	
	public void eliminarEmail (Mascota mascota) {
		mascotas.remove(mascota);
	}
	
	
	public void agregarHito (Hito hito) {
		hitos.add(hito);
	}
	
	
	public void eliminarHito (Hito hito) {
		hitos.remove(hito);
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


	public ArrayList<Mascota> getMascotas() {
		return mascotas;
	}


	public void setMascotas(ArrayList<Mascota> mascotas) {
		this.mascotas = mascotas;
	}
	
	
	
	
	

}
