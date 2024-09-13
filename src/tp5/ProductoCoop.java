package tp5;

public class ProductoCoop extends Producto {
	private int descuento = 10;
	
	ProductoCoop(int stock, float precio) {
		super(stock, precio);
	}

	public float precioDe(int cantidad) {
		return cantidad*getPrecio()*(descuento/100);
	}
}
