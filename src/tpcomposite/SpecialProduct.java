package tpcomposite;

public class SpecialProduct extends Product {

	private int offer;

	public SpecialProduct(float price, String name, int offer) {
		super(price, name);
		this.offer = offer;
	}

	@Override
	public float getPrice() {
		return (super.getPrice() * offer) / 100;
	}

}
