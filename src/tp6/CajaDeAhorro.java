package tp6;

public class CajaDeAhorro extends CuentaBancaria {
	private int limite;

	public CajaDeAhorro(String titular, int limite) {
		super(titular);
		this.limite = limite;
	}

	public int getLimite() {
		return this.limite;
	}

	@Override
	public boolean entraEnLímite(int monto) { // concrete operations
		return this.getSaldo() >= monto && this.getLimite() >= monto;
	}
}