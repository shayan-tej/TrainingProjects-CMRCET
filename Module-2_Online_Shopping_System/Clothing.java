package OnlineShoppingSystem;

public class Clothing extends Product {
	private final int size;
	private final String brand;
	public Clothing(String name, double cost, int size, String brand) {
		super(name, cost);
		this.size = size;
		this.brand = brand;
	}

	@Override
	public String getProductInfo() {
		return "Clothing Product Name: " + getProductName() + "\nCost: " + getProductCost() + "\nSize: " + size + "\nBrand: " + brand + ".";
	}

	public String getBrand() {
		return brand;
	}

	public int getSize() {
		return size;
	}
}
