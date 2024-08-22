package OnlineShoppingSystem;

class Electronic extends Product {
	private final int warranty;

	public Electronic(String name, double cost, int warranty) {
		super(name, cost);
		this.warranty = warranty;
	}

	@Override
	public String getProductInfo() {
		return "Electronic Product Name: " + getProductName() + "\nCost: " + getProductCost() + "\nWarranty: " + warranty + " months.";
	}

	public int getWarranty() {
		return warranty;
	}
}
