package ejercicio03;

public class Test {
	
	public static void main(String[] args) {
		
		Tienda tienda = new Tienda ();
		
		Heladera articulo1 = new Heladera("Whirlpool", "H2745", 678, 250, true, 14999, 50, true);
		Televisor articulo2 = new Televisor("Philips", "49PGFS", 34581812, 800, false, 14370, 500, false);
		Lavarropas articulo3 = new Lavarropas("Dream", "hy6712", 123123123, 500, false, 14000, 30, true);
		Licuadora articulo4 = new Licuadora("Sony", "frt45454", 1265883, 300, true, 1000, 1000, 3);
		
		
		tienda.agregarElectrodomestico(articulo1);
		tienda.agregarElectrodomestico(articulo2);
		tienda.agregarElectrodomestico(articulo3);
		tienda.agregarElectrodomestico(articulo4);
		
		tienda.imprimirProductos();
		
	}

}
