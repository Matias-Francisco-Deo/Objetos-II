package tp9doubles;

import java.util.Arrays;

public class JugadaTrío extends Jugada {

	public JugadaTrío(Carta carta1, Carta carta2, Carta carta3) {
		super(Arrays.asList(carta1, carta2, carta3));
	}

	@Override
	boolean esMayorJugadaQue(Jugada otraJugada) {
		return !otraJugada.esMayorQueTrío(this);
	}

	@Override
	public boolean esMayorQueTrío(JugadaTrío otroTrío) {
		return otroTrío.esMenorQueSíMismo(this);
	}

	@Override
	boolean esMayorQueColor(JugadaColor jugadaColor) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean esMayorQuePóker(JugadaPóquer jugadaPóquer) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	boolean esPoker() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean esTrío() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean esColor() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean esNada() {
		// TODO Auto-generated method stub
		return false;
	}

}
