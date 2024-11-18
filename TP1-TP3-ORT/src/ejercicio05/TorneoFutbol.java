package ejercicio05;

import java.util.ArrayList;

public abstract class TorneoFutbol {

	private ArrayList<Jornada> jornadas;
	private ArrayList<Equipo> equipos;
	
	public TorneoFutbol() {
		this.jornadas = new ArrayList<Jornada>();
		this.equipos = new ArrayList<Equipo>();
	}

	public void agregarJornada(Jornada jornada) {
		jornadas.add(jornada);
	}
	
	public void eliminarJornada(Jornada jornada) {
		jornadas.remove(jornada);
	}
	
	public void agregarEquipo(Equipo equipo) {
		equipos.add(equipo);
	}
	
	public void eliminarEquipo(Equipo equipo) {
		equipos.remove(equipo);
	}
	
	public void finalizarJornada(Jornada jornada) {
		if ( jornadas.contains(jornada) ) {
			for ( Partido partido : jornada.getPartidos() ) {
				calcularPuntos(partido);
			}
		}
	}
	
	public void mostrarTabla() {
		System.out.println(getTipo());
		System.out.println("Tabla de posiciones al cabo de " + String.valueOf(jornadas.size()) + " fechas:");
		
		if ( !equipos.isEmpty() ) {
			for ( Equipo equipo : equipos ) {
				System.out.println(equipo.toString()); 
			}
		}
	}
	
	public abstract String getTipo();
	
	public void calcularPuntos(Partido partido) {
		int puntosLocal				= 0;
		int puntosVisitante			= 0;
		int golesEquipoLocal 		= partido.getGolesEquipoLocal();
		int golesEquipoVisitante 	= partido.getGolesEquipoVisitante();
		
		if ( golesEquipoLocal > golesEquipoVisitante ) {
			puntosLocal += puntajePartidoGanado();	
			puntosVisitante += puntajePartidoPerdido();
		} else if ( golesEquipoLocal < golesEquipoVisitante ) {
			puntosVisitante += puntajePartidoGanado();
			puntosLocal += puntajePartidoPerdido();
		} else {
			puntosVisitante += puntajePartidoEmpatado();
			puntosLocal += puntajePartidoEmpatado();
			if ( golesEquipoLocal >= 3 && golesEquipoVisitante >= 3) {
				puntosLocal += puntajeEmpateMas3Goles();
				puntosVisitante += puntajeEmpateMas3Goles();
			}
		}
		
		if ( golesEquipoLocal == 0 ) {
			puntosVisitante += puntajeVallaInvicta();
		}
		
		if ( golesEquipoVisitante == 0 ) {
			puntosLocal += puntajeVallaInvicta();
		}
		
		if ( golesEquipoLocal - golesEquipoVisitante >= 4 ) {
			puntosLocal += puntajeGanador4Goles();
		}
		
		if ( golesEquipoVisitante - golesEquipoLocal >= 4 ) {
			puntosVisitante += puntajeGanador4Goles();
		}
		
		partido.getEquipoLocal().setPuntos(puntosLocal);
		partido.getEquipoVisitante().setPuntos(puntosVisitante);
	}
	
	public int puntajePartidoEmpatado() {
		return 1;
	}
	
	public abstract int puntajePartidoGanado();
	
	public abstract int puntajePartidoPerdido();
	
	public abstract int puntajeVallaInvicta();
	
	public abstract int puntajeGanador4Goles();
	
	public abstract int puntajeEmpateMas3Goles();
	
}