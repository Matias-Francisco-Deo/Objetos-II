package tp5;

import java.util.List;

public class Caja {
	private int total = 0;
	
	public void registrarProductosCliente(List<Producto> productos) {
		for (Producto prod : productos) {
			total += prod.getPrecio();
			prod.decrementarStock(1);
		}
	}
	public float getTotal() {
		return total;
	}
}
