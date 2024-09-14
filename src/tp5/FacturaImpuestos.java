package tp5;

public class FacturaImpuestos extends Factura {

	FacturaImpuestos(float precio) {
		super(precio);
	}

	@Override
	public float getPrecioTotal() {
		return getPrecio();
		
	}
	

}
