package tp5;

public abstract class Producto implements Pagable{
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
	
//	abstract public float precioDe(int cantidad);
	
	public void registrar(Caja caja) {
		this.decrementarStock(1);
	}


}
