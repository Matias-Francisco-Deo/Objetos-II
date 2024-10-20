package tpcomposite;

import java.util.ArrayList;
import java.util.List;

public class CarroDeCompras {

	private List<Product> elements = new ArrayList<Product>();

	private void setElements(List<Product> productos) {
		elements = productos;
	}

	public List<Product> getElements() {
		return this.elements;
	}

	public int totalRounded() {
		return (int) Math.round(this.elements.stream().mapToDouble(Product::getPrice).sum());
	}

	public float total() {
		return (int) this.elements.stream().mapToDouble(Product::getPrice).sum();
	}

}
