import java.util.Scanner;
import java.util.HashMap;

class Product {
    String name;
    int quantity;
    double price;

    Product(String name, int quantity, double price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }
}

public class Q116 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, Product> inventoryMap = new HashMap<>();
        boolean exit = false;

        System.out.println("=== INVENTORY MANAGEMENT SYSTEM ===");

        while (!exit) {
            System.out.println("\n--- MAIN MENU ---");
            System.out.println("1. Add New Product");
            System.out.println("2. Update Stock Quantity");
            System.out.println("3. View Inventory Status");
            System.out.println("4. Search Product Details");
            System.out.println("5. Exit");
            System.out.print("Enter your choice (1-5): ");

            if (!sc.hasNextInt()) {
                System.out.println("Invalid selection. Please enter a valid menu index.");
                sc.next();
                continue;
            }

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Product ID: ");
                    int id = sc.nextInt();
                    if (inventoryMap.containsKey(id)) {
                        System.out.println("Error: Product ID already exists.");
                        break;
                    }
                    sc.nextLine();
                    System.out.print("Enter Product Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Initial Quantity: ");
                    int qty = sc.nextInt();
                    System.out.print("Enter Price per Unit: ");
                    double price = sc.nextDouble();
                    inventoryMap.put(id, new Product(name, qty, price));
                    System.out.println("Product added successfully.");
                    break;

                case 2:
                    System.out.print("Enter Product ID to update: ");
                    int upId = sc.nextInt();
                    if (inventoryMap.containsKey(upId)) {
                        System.out.print("Enter new quantity: ");
                        int newQty = sc.nextInt();
                        inventoryMap.get(upId).quantity = newQty;
                        System.out.println("Stock updated.");
                    } else {
                        System.out.println("Product not found.");
                    }
                    break;

                case 3:
                    if (inventoryMap.isEmpty()) {
                        System.out.println("Inventory is empty.");
                        break;
                    }
                    System.out.println("\n--- CURRENT INVENTORY ---");
                    for (int pId : inventoryMap.keySet()) {
                        Product p = inventoryMap.get(pId);
                        System.out.println("ID: " + pId + " | Name: " + p.name + " | Qty: " + p.quantity + " | Price: Rs. " + p.price);
                    }
                    break;

                case 4:
                    System.out.print("Enter Product ID to search: ");
                    int searchId = sc.nextInt();
                    if (inventoryMap.containsKey(searchId)) {
                        Product p = inventoryMap.get(searchId);
                        System.out.println("Name: " + p.name + " | Qty: " + p.quantity + " | Price: Rs. " + p.price);
                    } else {
                        System.out.println("Product not found.");
                    }
                    break;

                case 5:
                    exit = true;
                    System.out.println("Exiting inventory system. Goodbye.");
                    break;

                default:
                    System.out.println("Invalid selection.");
            }
        }
        sc.close();
    }
}