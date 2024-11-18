package ejercicio03;
import java.util.ArrayList;

public class Competencia {
	
	public static void main(String[] args) {
		
		Carrera carrera1 = new Carrera ("100 mts");
		
		Atleta atleta1 = new Atleta("Antonio", 9.81);
		Atleta atleta2 = new Atleta("Bruno", 9.85);
		Atleta atleta3 = new Atleta("Carlos", 9.86);
		Atleta atleta4 = new Atleta("Daniel", 10.01);
		Atleta atleta5 = new Atleta("Esteban", 9.97);
		Atleta atleta11 = new Atleta("Mariana", 10.01);
		Atleta atleta12 = new Atleta("Luis", 9.80);
		Atleta atleta13 = new Atleta("Cesar", 9.97);
		Atleta atleta14 = new Atleta("Marisa", 10.01);
		Atleta atleta15 = new Atleta("Silvia", 9.80);
		
		carrera1.agregarAtleta(atleta1);
		carrera1.agregarAtleta(atleta2);
		carrera1.agregarAtleta(atleta3);
		carrera1.agregarAtleta(atleta4);
		carrera1.agregarAtleta(atleta5);
		carrera1.agregarAtleta(atleta11);
		carrera1.agregarAtleta(atleta12);
		carrera1.agregarAtleta(atleta13);
		carrera1.agregarAtleta(atleta14);
		carrera1.agregarAtleta(atleta15);
		
		System.out.println("Competencia #1");
		System.out.println();
		
		System.out.println("Ganadores: ");
		for ( Atleta ganadores: carrera1.ganadores() ) {
			System.out.println(ganadores.toString());
		}

		System.out.println();
		
		System.out.println("----------");
		ArrayList<Posicion> ganadores = carrera1.getTernaGanadores();
		
		System.out.println("Terna de ganadores");
		for (int i = 0; i < ganadores.size(); i++) {
			for (int j = 0; j<ganadores.get(i).getListaAtletas().size();j++){
				System.out.println("El atleta: " + ganadores.get(i).getListaAtletas().get(j).getNombre()+ " termino la competencia con tiempo: " + ganadores.get(i).getTiempo() + " y obtuvo el puesto numero: " + (i+1));
			}
		}
		
		
		
	}

}
