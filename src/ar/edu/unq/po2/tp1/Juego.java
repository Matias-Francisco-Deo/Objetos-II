package ar.edu.unq.po2.tp1;

public abstract class Juego implements Nombrable {
	private int horasJugadas = 0;
	public String jugador = "";
	
	public Juego(String jugador) {
		this.jugador = jugador;
	}
	
	public void aumentarHoras() {
		this.horasJugadas += 1;
	}
	
	public int getHoras() {
		return this.horasJugadas;
	}
	
	protected abstract String getReglas();
}
