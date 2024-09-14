package tp5;

public class FacturaServicios extends Factura {
	private int unidadesConsumidasTotales;

	FacturaServicios(float precio, int unidadesConsumidasTotales) {
		super(precio);
		this.unidadesConsumidasTotales = unidadesConsumidasTotales;
	}

	@Override
	public float getPrecioTotal() {
		return getPrecio()*unidadesConsumidasTotales;
		
	}
	

}
