package tp9doubles;

import java.util.List;

public abstract class Jugada {

//	private List<Carta> cartas;
//
	public Jugada(List<Carta> cartas) {
		this.cartas = cartas;
	}

	private List<Carta> cartas;

	abstract boolean esMayorJugadaQue(Jugada otraJugada);

	abstract boolean esMayorQueColor(JugadaColor jugadaColor);

	abstract public boolean esMayorQuePóker(JugadaPóquer jugadaPóquer);

	abstract boolean esMayorQueTrío(JugadaTrío jugadaTrío);

	public List<Carta> getCartas() {
		return this.cartas;
	}

	public boolean esMenorQueSíMismo(Jugada otraJugada) {
		long total = cartas.stream().mapToInt(carta -> carta.getValor()).sum();
		long otroTotal = otraJugada.cartas.stream().mapToInt(carta -> carta.getValor()).sum();
		return total < otroTotal;
	}

	abstract boolean esPoker();

	abstract public boolean esTrío();

	abstract public boolean esColor();

	abstract public boolean esNada();

}
