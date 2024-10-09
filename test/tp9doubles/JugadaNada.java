package tp9doubles;

public class JugadaNada extends Jugada {

	public JugadaNada() {
		super(null);
		// TODO Auto-generated constructor stub
	}

	@Override
	boolean esMayorJugadaQue(Jugada otraJugada) {
		// TODO Auto-generated method stub
		return false;
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
	boolean esMayorQueTrío(JugadaTrío jugadaTrío) {
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
		return true;
	}

}
