package OnlineShoppingSystem;

public abstract class Product {
	private final String name;
	private final double cost;

	public Product(String name, double cost) {
		this.name = name;
		this.cost = cost;
	}

	public String getProductName() {
		return this.name;
	}

	public double getProductCost() {
		return this.cost;
	}

	public abstract String getProductInfo();
}
