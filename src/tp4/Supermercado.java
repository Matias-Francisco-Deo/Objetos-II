package tp4;

import java.util.ArrayList;
import java.util.List;

public class Supermercado {
	private String nombre;
	private String dirección;
	private List<Producto> productos = new ArrayList<Producto>();;
	
	Supermercado(String nombre, String dirección) {
		this.nombre = nombre;
		this.dirección = dirección;
	}
	
	public void agregarProducto(Producto p) {
		productos.add(p);
	}
	
	public int getCantidadDeProductos() {
		return productos.size();
	}
	
	public double getPrecioTotal() {
		double total = 0d;
		for (Producto p: productos) {
			total += p.precio;
		}
		return total;
	}
}
