package tp6;

public class CuentaCorriente extends CuentaBancaria {
	private int descubierto;

	public CuentaCorriente(String titular, int descubierto) {
		super(titular);
		this.descubierto = descubierto;
	}

	public int getDescubierto() {
		return this.descubierto;
	}

	@Override
	public boolean entraEnLímite(int monto) { // concrete operations
		return this.getSaldo() + this.getDescubierto() >= monto;
	}
}