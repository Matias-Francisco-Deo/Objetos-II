package parcial2;

public class GastoAdministrativo {
	private String concepto;
	private float monto;

	public GastoAdministrativo(String concepto, float monto) {
		this.setConcepto(concepto);
		this.setMonto(monto);
	}

	public String getConcepto() {
		return concepto;
	}

	private void setConcepto(String concepto) {
		this.concepto = concepto;
	}

	public float getMonto() {
		return monto;
	}

	private void setMonto(float monto) {
		this.monto = monto;
	}
}
