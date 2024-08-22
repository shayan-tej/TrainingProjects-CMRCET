package OnlineShoppingSystem;

import java.util.ArrayList;

class Cart {
	private int totalItems;
	private final ArrayList<Product> items = new ArrayList<Product>();
	private double totalBill;

	public void addItemIntoCart(Product product) {
		items.add(product);
	}

	public void removeItemInCart(int index) {
		items.remove(index - 1);
	}

	public int getTotalItems() {
		totalItems = items.size();
		return totalItems;
	}

	public void calculateBill() {
		double total = 0;
		for (Product item : items)
			total += item.getProductCost();
		totalBill = total;

		double gstRate = 0.18;
		double gstAmount = totalBill * gstRate;
		double totalAmountWithGst = totalBill + gstAmount;

		System.out.printf("\nYour Total bill is ₹%.2f%n", totalBill);
		System.out.printf("GST (18%%): ₹%.2f%n", gstAmount);
		System.out.printf("Total Bill with GST: ₹%.2f%n", totalAmountWithGst);
	}

	public void showCart() {
		int idWidth = 6;
		int nameWidth = 30;
		int costWidth = 10;
		int brandWidth = 20;

		System.out.println("\n---- Shopping Cart ----");
		System.out.printf("%-" + idWidth + "s %-"+ nameWidth + "s %-" + costWidth + "s %-" + brandWidth + "s%n",
				"ID", "Name", "Cost", " Warranty / Brand");

		for (int i = 0; i < items.size(); i++) {
			Product product = items.get(i);
			String detail = "";

			if (product instanceof Electronic) {
				detail = String.valueOf(((Electronic) product).getWarranty() + " months");
			} else if (product instanceof Clothing) {
				detail = ((Clothing) product).getBrand();
			}

			System.out.printf("%-" + idWidth + "d %-"+ nameWidth + "s ₹%-" + costWidth + ".2f %-" + brandWidth + "s%n",
					i + 1,
					product.getProductName(),
					product.getProductCost(),
					detail
			);
		}
		System.out.println("Total " + getTotalItems() + " products in cart.");
	}
}
