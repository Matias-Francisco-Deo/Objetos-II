package ar.edu.unq.po2.tp1;

import java.util.ArrayList;

public class Ajedrez extends Juego {

	private ArrayList<String> posiblesTiempos;

	public Ajedrez(String jugador) {
		super(jugador);
		ArrayList<String> posiblesTiempos = null;
		posiblesTiempos.add("30");
		posiblesTiempos.add("15");
		this.posiblesTiempos = posiblesTiempos;
		
	}

	@Override
	protected String getReglas() {
		return "Configura el tablero de ajedrez\r\n"
				+ "Aprende a mover las piezas en ajedrez\r\n"
				+ "Descubre las reglas especiales\r\n"
				+ "Averigua quien hace la 1ª jugada\r\n"
				+ "Revisa las normas de cómo ganar\r\n"
				+ "Estudia las estrategias básicas\r\n"
				+ "Practica jugando muchas partidas"
				+ this.posiblesTiempos.get(1);
	}

	@Override
	public String getNombre() {
		// TODO Auto-generated method stub
		return "Ajedrez";
	}
	
	public String toString() {
		return "Juego " + this.getNombre();
	}
	
	public boolean equals(Object obj) {
		if (!(obj instanceof Juego) ) {
			return false;
		}
		Juego otroJuego = (Juego) obj;
		return otroJuego.getNombre() == this.getNombre();
	}

}
