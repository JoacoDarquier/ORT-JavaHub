package ejercicio05;

public class Test {
	public static void main(String[] args) {
		
		Edificio edificio = new Edificio();
		
		Direccion d1 = new Direccion("Montañeses", 1234, 4, "C");
		Direccion d2 = new Direccion("Montañeses", 1234, 2, "B");
		
		Vivienda v1 = new Vivienda(d1);
		Vivienda v2 = new Vivienda(d2);
		
		Persona p1 = new Persona ("Arturo", "Roman", 53);
		Persona p2 = new Persona ("Mónica", "Gaztambide", 35);
		
		Mueble m1 = new Mueble ("Mesa", "madera", "Marron");
		Mueble m2 = new Mueble ("Mesada", "Mármol", "Rojo");
		Mueble m3 = new Mueble ("Perchero", "Metal", "Negro");
		Mueble m4 = new Mueble ("Sillón", "Cuero", "Azul");
		
		
		edificio.agregarVivienda(v1);
		edificio.agregarVivienda(v2);
		
		v1.agregarPersona(p1);
		v1.agregarPersona(p2);
		
		v1.agregarMueble(m1);
		v1.agregarMueble(m2);
		v1.agregarMueble(m3);
		v1.agregarMueble(m4);
		
		edificio.mostrarTodo();
		
		edificio.realizarMudanza(4, "C", 2, "B");
		
		edificio.mostrarTodo();
		
		
	}

}
