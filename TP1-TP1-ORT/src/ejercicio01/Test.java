package ejercicio01;

public class Test {
	
	public static void main(String[] args) {
		
		Grupo grupo = new Grupo ("Los cocos");
		
		grupo.agregarIntegrante("Joaquin");
		grupo.agregarIntegrante("Charly");
		grupo.agregarIntegrante("Leonel");
		grupo.agregarIntegrante("Wayne");
		
		System.out.println();
		
		System.out.println(grupo.buscarIntegrante("Charly"));
		System.out.println(grupo.buscarIntegrante("Alejandro"));
		
		System.out.println();
		
		grupo.mostrar();
		
		System.out.println();
		
		System.out.println(grupo.removerIntegrante("Wayne"));
		
		System.out.println();
		
		System.out.println(grupo.removerIntegrante("Wayne"));
		
		System.out.println();
		
		grupo.mostrar();
		
		System.out.println();
		
		grupo.vaciar();
		
		grupo.mostrar();
		
	}
}
