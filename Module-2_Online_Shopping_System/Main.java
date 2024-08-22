/*
Online Shopping System
Concepts Used:
 - Classes (OnlineShoppingSystem.Product, OnlineShoppingSystem.Cart, OnlineShoppingSystem.Order)
 - Inheritance (Electronics, OnlineShoppingSystem.Clothing)
 - Encapsulation (OnlineShoppingSystem.Product details, OnlineShoppingSystem.Order status)
 - Polymorphism (Different discount strategies)
*/

package OnlineShoppingSystem;

import java.util.Scanner;

public class Main {
	static Store store = new Store();
	static Cart customerCart = new Cart();
	static Scanner scan = new Scanner(System.in);

	static void electronicsPage() {
		store.displayElectronics();
		while (true) {
			System.out.print("Enter 0 to go back\nEnter Product ID to add item in cart: ");
			int choice = scan.nextInt();
			if (store.electronicStore.containsKey(choice)) {
				customerCart.addItemIntoCart(store.electronicStore.get(choice));
				System.out.println("Item added!");
			} else if (choice == 0) {
				return;
			} else {
				System.out.println("Invalid product ID entered!");
			}
		}
	}

	static void clothingPage() {
		store.displayClothings();
		while (true) {
			System.out.print("Enter 0 to go back\nEnter Product ID to add item in cart: ");
			int choice = scan.nextInt();
			if (store.clothingStore.containsKey(choice)) {
				customerCart.addItemIntoCart(store.clothingStore.get(choice));
				System.out.println("Item added!");
			} else if (choice == 0) {
				return;
			} else {
				System.out.println("Invalid product ID entered!");
			}
		}
	}

	static void editCart() {
		customerCart.showCart();
		while (true) {
			System.out.println("Enter 0 to go back\nEnter the id of the product to remove: ");
			int choice = scan.nextInt();
			if (choice < customerCart.getTotalItems() + 1 && choice > 0) {
				customerCart.removeItemInCart(choice);
				System.out.println("Product removed!");
			} else if (choice == 0) {
				return;
			} else {
				System.out.println("Invalid product ID entered!");
			}
		}
	}

	static void checkout() {
		customerCart.calculateBill();
		System.out.println("Thanks for visiting :)");
	}

	public static void main(String[] args) {
		while (true) {
			System.out.println("\n---- Online Shopping System ----");
			System.out.print("""
					1. Buy Electronic Products
					2. Buy Clothing Products
					3. Show Cart
					4. Remove products from cart
					5. Checkout
					0. Exit / Quit
					Enter number to select:\s""");
			int choice = scan.nextInt();
			switch (choice) {
				case 0:
					return;
				case 1:
					electronicsPage();
					break;
				case 2:
					clothingPage();
					break;
				case 3:
					customerCart.showCart();
					break;
				case 4:
					editCart();
					break;
				case 5:
					checkout();
					return;
				default:
					System.out.println("Invalid!");
			}
		}
	}
}
