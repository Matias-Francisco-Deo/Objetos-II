package tpcomposite;

public class Product {

	private float price;
	private String name;

	public Product(float price, String name) {
		this.setPrice(price);
		this.setName(name);
	}

	public float getPrice() {
		return price;
	}

	private void setPrice(float price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	private void setName(String name) {
		this.name = name;
	}
}
