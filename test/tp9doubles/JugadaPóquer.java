package tp9doubles;

import java.util.Arrays;

public class JugadaPóquer extends Jugada {

	public JugadaPóquer(Carta carta1, Carta carta2, Carta carta3, Carta carta4) {
		super(Arrays.asList(carta1, carta2, carta3, carta4));
	}

	@Override
	boolean esMayorJugadaQue(Jugada otraJugada) {
		return !otraJugada.esMayorQuePóker(this);
	}

	@Override
	boolean esMayorQueColor(JugadaColor color) {
		return true;
	}

	@Override
	public boolean esMayorQuePóker(JugadaPóquer otroPoker) {
		return otroPoker.esMenorQueSíMismo(this);
	}

	@Override
	protected boolean esMayorQueTrío(JugadaTrío jugadaTrío) {
		return true;
	}

	@Override
	boolean esPoker() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean esTrío() {
		// TODO Auto-generated method stub
		return false;
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
