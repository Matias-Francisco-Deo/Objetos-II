package tp5;

public class ProductoTrad extends Producto {

	ProductoTrad(int stock, float precio) {
		super(stock, precio);
	}

	@Override
	public float precioDe(int cantidad) {
		return cantidad*getPrecio();
	}

}
