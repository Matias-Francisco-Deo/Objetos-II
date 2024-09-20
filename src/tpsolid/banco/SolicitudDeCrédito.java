package tpsolid.banco;

public abstract class SolicitudDeCrédito {
	private Cliente cliente;
	private float monto;
	private int plazoMeses;
	
	SolicitudDeCrédito(Cliente cliente, float monto, int plazoMeses) {
		this.setCliente(cliente);
		this.monto = monto;
		this.plazoMeses = plazoMeses;
	}
	
	public void enviarSaldo() {
		cliente.enviarSaldo(monto);
	}
	
	public float getMontoMensual() {
		return monto;
	}
	
	public float getMontoTotal() {
		return monto * plazoMeses;
	}
	
	abstract boolean realizarChequeo();

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	} 
}
