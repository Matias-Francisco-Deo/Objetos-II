package tp9doubles;

import java.util.Arrays;

public class JugadaColor extends Jugada {

	public JugadaColor(Carta carta1, Carta carta2, Carta carta3, Carta carta4, Carta carta5) {
		super(Arrays.asList(carta1, carta2, carta3, carta4, carta5));
	}

	@Override
	boolean esMayorJugadaQue(Jugada otraJugada) {
		return !otraJugada.esMayorQueColor(this);
	}

	@Override
	boolean esMayorQueColor(JugadaColor otroColor) {
		return otroColor.esMenorQueSíMismo(this);
	}

	@Override
	public boolean esMayorQuePóker(JugadaPóquer jugadaPóquer) {
		return false;
	}

	@Override
	protected boolean esMayorQueTrío(JugadaTrío jugadaTrío) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	boolean esPoker() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean esTrío() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean esColor() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean esNada() {
		// TODO Auto-generated method stub
		return false;
	}

}
