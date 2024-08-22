package OnlineShoppingSystem;

import java.util.HashMap;
import java.util.Map;

public class Store {
	public final Map<Integer, Electronic> electronicStore = new HashMap<>();
	public final Map<Integer, Clothing> clothingStore = new HashMap<>();

	public void displayElectronics() {
		int idWidth = 6;
		int nameWidth = 30;
		int costWidth = 15;
		int warrantyWidth = 10;

		System.out.println("\n---- Electronic Store ----");
		System.out.printf("%-" + idWidth + "s %-"+ nameWidth + "s %-" + costWidth + "s %-" + warrantyWidth + "s%n",
				"ID", "Name", "Cost", " Warranty");

		for (Map.Entry<Integer, Electronic> product : electronicStore.entrySet()) {
			System.out.printf("%-" + idWidth + "d %-"+ nameWidth + "s ₹%-" + costWidth + ".2f %-" + warrantyWidth + "s%n",
					product.getKey(),
					product.getValue().getProductName(),
					product.getValue().getProductCost(),
					product.getValue().getWarranty() + " months");
		}
	}

	public void displayClothings() {
		int idWidth = 6;
		int nameWidth = 30;
		int costWidth = 10;
		int brandWidth = 15;
		int sizeWidth = 10;

		System.out.println("\n---- Clothing Store ----");
		System.out.printf("%-" + idWidth + "s %-"+ nameWidth + "s %-" + costWidth + "s %-" + brandWidth + "s %-" + sizeWidth + "s%n",
				"ID", "Name", "Cost", " Brand", " Size");

		for (Map.Entry<Integer, Clothing> product : clothingStore.entrySet()) {
			System.out.printf("%-" + idWidth + "d %-"+ nameWidth + "s ₹%-" + costWidth + ".2f %-" + brandWidth + "s %-" + sizeWidth + "s%n",
					product.getKey(),
					product.getValue().getProductName(),
					product.getValue().getProductCost(),
					product.getValue().getBrand(),
					product.getValue().getSize());
		}
	}

	{
		electronicStore.put(101, new Electronic("Lenovo Laptop", 60000, 36));
		electronicStore.put(102, new Electronic("iPhone 15 Pro", 150000, 12));
		electronicStore.put(103, new Electronic("Airpods Gen 3", 25000, 10));
		electronicStore.put(104, new Electronic("HP Pavilion", 55000, 36));
		electronicStore.put(105, new Electronic("Samsung S24 Ultra", 119000, 12));
		electronicStore.put(106, new Electronic("One Plus Nord CE4", 24999, 24));
		electronicStore.put(107, new Electronic("JBL Bluetooth Speaker", 1999, 9));
		electronicStore.put(108, new Electronic("Cosmic Byte Headset", 820, 2));
		electronicStore.put(109, new Electronic("Macbook Air M1", 72590, 20));
		electronicStore.put(110, new Electronic("Xiaomi Pad 6", 25999, 24));
		electronicStore.put(111, new Electronic("HP Victus", 55500, 36));
		electronicStore.put(112, new Electronic("Canon E4570 Printer", 7999, 12));
		electronicStore.put(113, new Electronic("Sandisk 1TB SSD", 8899, 6));
		clothingStore.put(201, new Clothing("Lenin Green Shirt", 4449, 34, "Noble Monk"));
		clothingStore.put(202, new Clothing("Tropical Shirt", 11269, 28, "Zafoni"));
		clothingStore.put(203, new Clothing("Strawberry Milk Hoodie", 6893, 36, "Levis"));
		clothingStore.put(204, new Clothing("Goth Shirt", 4370, 38, "H&M"));
		clothingStore.put(205, new Clothing("Nike Pants", 4999, 28, "Nike"));
		clothingStore.put(206, new Clothing("Collar Blazer", 4489, 36, "Arrow"));
		clothingStore.put(207, new Clothing("Indo Western Sherwani", 5970, 34, "Kisah"));
		clothingStore.put(208, new Clothing("Oversize Y2K Hoodie", 5599, 30, "Zara"));
		clothingStore.put(209, new Clothing("Cargo Pants", 6999, 32, "Zara"));
		clothingStore.put(210, new Clothing("Formal Fit Shirt", 2300, 34, "Rare Rabbit"));
		clothingStore.put(211, new Clothing("Baggy Jeans", 6900, 28, "Gucci"));
		clothingStore.put(212, new Clothing("Mootoo Jacket", 3950, 36, "Borleni"));
		clothingStore.put(213, new Clothing("Adidas T-Shirt", 1990, 30, "Adidas"));
	}
}
