package tp5;

public class AgenciaRecaudadora implements Agencia {
	private float pagosTotales;

	public void registrarPago(Factura factura) {
		pagosTotales += factura.getPrecioTotal();

	}

	public float getPagosTotales() {
		return pagosTotales;
	}

	public void setPagosTotales(float pagosTotales) {
		this.pagosTotales = pagosTotales;
	}

}
