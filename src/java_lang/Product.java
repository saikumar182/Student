package java_lang;

import java.util.Comparator;

class Product {
	protected String name;
	protected int price;

	public Product(String name, int price) {
		super();
		this.name = name;
		this.price = price;

	}

	@Override
	public String toString() {
		return this.name + ":" + this.price;

	}

	public int getPrice() {
		return price;
	}
}

class CompareByPrice implements Comparator<Product> {

	@Override
	public int compare(Product a1, Product a2) {
		return a1.getPrice() - a2.getPrice();
	}

}
