package tp5;

public abstract class Producto {
	private int stock;
	private float precio;

	Producto (int stock, float precio) {
		this.stock = stock;
		this.precio = precio;
	}

	public int getStock() {
		return stock;
	}

	public float getPrecio() {
		return precio;
	}
	public void decrementarStock(int cantidad) {
		stock -= cantidad;
	}
	
	abstract public float precioDe(int cantidad);


}
