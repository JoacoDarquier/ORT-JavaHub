package ejercicio01;

public class Test {
	public static void main(String[] args) {
		
		Anio anio = new Anio ();
		
		
        for (int mes = 1; mes <= 12; mes++) {
            System.out.println("Días transcurridos antes del comienzo de " + anio.getNombreDelMes(mes) + ": " + anio.diasTranscurridos(mes));
        }

        int mesCumpleaños1 = 3;
        int diaCumpleaños1 = 15;
        int diaDelAnioCumpleaños1 = anio.diasTranscurridos(mesCumpleaños1) + diaCumpleaños1;
        System.out.println("El cumpleaños del integrante 1 es el día " + diaDelAnioCumpleaños1 + " del año.");

        int mesCumpleaños2 = 7;
        int diaCumpleaños2 = 22;
        int diaDelAnioCumpleaños2 = anio.diasTranscurridos(mesCumpleaños2) + diaCumpleaños2;
        System.out.println("El cumpleaños del integrante 2 es el día " + diaDelAnioCumpleaños2 + " del año.");
        
		
		
//		try {
//			System.out.println(anio.getNombreDelMes(11));
//		} catch (IllegalArgumentException e) {
//			System.out.println("Error. " + e.getMessage());
//		}
//		
//		
//		try {
//			System.out.println(anio.diasTranscurridos(12));
//		} catch (IllegalArgumentException e) {
//			System.out.println("Error. " + e.getMessage());
//		}
//		
		
		
	}

}
