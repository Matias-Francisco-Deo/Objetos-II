package tp6;

import java.util.ArrayList;
import java.util.List;

public abstract class CuentaBancaria {
	private String titular;
	private int saldo;
	private List<String> movimientos;

	public CuentaBancaria(String titular) {
		this.titular = titular;
		this.saldo = 0;
		this.movimientos = new ArrayList<String>();
	}

	public String getTitular() { // concrete AbstractClass operations
		return this.titular;
	}

	public int getSaldo() {// concrete AbstractClass operations
		return this.saldo;
	}

	protected void setSaldo(int monto) {// concrete AbstractClass operations
		this.saldo = monto;
	}

	public void agregarMovimientos(String movimiento) {// concrete AbstractClass operations
		this.movimientos.add(movimiento);
	}

	public final void extraer(int monto) { // template method
		if (entraEnLímite(monto)) {
			realizarExtracción(monto);
			this.agregarMovimientos("Extraccion");
		}
	}

	public void realizarExtracción(int monto) { // concrete AbstractClass operations
		this.setSaldo(this.getSaldo() - monto);
	}

	public abstract boolean entraEnLímite(int monto); // primitive operations
}
