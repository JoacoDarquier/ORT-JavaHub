package ejercicio02;

public class AnioV2 {
	
	public Mes mes;
	
	int [] diasXMes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	
	
	public String getNombreDelMes(int numeroMes) {
		
		if ( numeroMes >= 1 && numeroMes <= 12 ) {
			return mes.values()[numeroMes - 1].name();
		} else {
			throw new IllegalArgumentException("El mes ingresado no existe");
		}
		
	}
	
	
	public int diasTranscurridos(int numeroMes) {
		
		if ( numeroMes >= 1 && numeroMes <= 12 ) {
			int conteoDias = 0;
			for ( int i=0; i < numeroMes - 1; i++ ) {
				conteoDias += diasXMes[i];
			}
			return conteoDias;
		} else {
			throw new IllegalArgumentException("El mes ingresado no existe");
		}
		
	}

	
	

}
