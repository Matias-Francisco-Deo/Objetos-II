package parcial2;

public class ÍtemPóliza {
	int cantidad;
	float valorUnitario;

	public ÍtemPóliza(int cantidad, float valorUnitario) {
		setCantidad(cantidad);
		setValorUnitario(valorUnitario);
	}

	private int getCantidad() {
		return this.cantidad;
	}

	private void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public float getValorUnitario() {
		return this.valorUnitario;
	}

	public void setValorUnitario(float valorUnitario) {
		this.valorUnitario = valorUnitario;
	}

	public float getValorTotal() {
		return this.getValorUnitario() * this.getCantidad();
	}
}
