package tp5;

public class ProductoCoop extends Producto {
	private float descuento = 10;
	
	ProductoCoop(int stock, float precio) {
		super(stock, precio);
	}

//	public float precioDe(int cantidad) {
//		return cantidad*getPrecio()*(1 - descuento/100);
//	}

	@Override
	public float getPrecioTotal() {
		float descTotal = 1f - descuento/100;
		return getPrecio()*descTotal;
	}

	
}
