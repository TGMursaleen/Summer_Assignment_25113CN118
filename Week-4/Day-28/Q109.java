import java.util.Scanner;
import java.util.HashMap;

class Book {
    String title;
    String author;
    boolean isBorrowed;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isBorrowed = false;
    }
}

public class Q109 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, Book> libraryMap = new HashMap<>();
        boolean exit = false;

        System.out.println("=== LIBRARY MANAGEMENT SYSTEM ===");

        while (!exit) {
            System.out.println("\n--- MAIN MENU ---");
            System.out.println("1. Add New Book");
            System.out.println("2. View All Books");
            System.out.println("3. Search Book by ID");
            System.out.println("4. Borrow Book");
            System.out.println("5. Return Book");
            System.out.println("6. Exit");
            System.out.print("Enter your choice (1-6): ");

            if (!sc.hasNextInt()) {
                System.out.println("Invalid Option! Please enter a valid integer between 1 and 6.");
                sc.next();
                continue;
            }

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Book ID: ");
                    if (!sc.hasNextInt()) { System.out.println("Invalid ID format!"); sc.next(); break; }
                    int id = sc.nextInt();
                    if (id <= 0) { System.out.println("Error: ID must be greater than 0."); break; }

                    if (libraryMap.containsKey(id)) {
                        System.out.println("Error: Book ID already exists in the catalog!");
                        break;
                    }

                    sc.nextLine(); 
                    System.out.print("Enter Book Title: ");
                    String title = sc.nextLine();
                    System.out.print("Enter Author Name: ");
                    String author = sc.nextLine();

                    libraryMap.put(id, new Book(title, author));
                    System.out.println("Book cataloged successfully!");
                    break;

                case 2:
                    if (libraryMap.isEmpty()) {
                        System.out.println("No books available in the inventory registry.");
                        break;
                    }

                    System.out.println("\n--- INVENTORY REGISTER ---");
                    System.out.printf("%-10s %-25s %-20s %-15s\n", "Book ID", "Title", "Author", "Status");
                    System.out.println("-------------------------------------------------------------------------");
                    for (int bookId : libraryMap.keySet()) {
                        Book b = libraryMap.get(bookId);
                        String status = b.isBorrowed ? "Borrowed" : "Available";
                        System.out.printf("%-10d %-25s %-20s %-15s\n", bookId, b.title, b.author, status);
                    }
                    break;

                case 3:
                    System.out.print("Enter Book ID to search: ");
                    if (!sc.hasNextInt()) { sc.next(); break; }
                    int searchId = sc.nextInt();

                    if (libraryMap.containsKey(searchId)) {
                        Book b = libraryMap.get(searchId);
                        System.out.println("\nRecord Found:");
                        System.out.println("Book ID   : " + searchId);
                        System.out.println("Title     : " + b.title);
                        System.out.println("Author    : " + b.author);
                        System.out.println("Status    : " + (b.isBorrowed ? "Borrowed" : "Available"));
                    } else {
                        System.out.println("No matching catalog asset discovered for ID: " + searchId);
                    }
                    break;

                case 4:
                    System.out.print("Enter Book ID to borrow: ");
                    if (!sc.hasNextInt()) { sc.next(); break; }
                    int borrowId = sc.nextInt();

                    if (libraryMap.containsKey(borrowId)) {
                        Book b = libraryMap.get(borrowId);
                        if (!b.isBorrowed) {
                            b.isBorrowed = true;
                            System.out.println("Transaction Approved! Enjoy reading: " + b.title);
                        } else {
                            System.out.println("Transaction Denied: Book is currently checked out.");
                        }
                    } else {
                        System.out.println("Invalid Book ID! Asset not found.");
                    }
                    break;

                case 5:
                    System.out.print("Enter Book ID to return: ");
                    if (!sc.hasNextInt()) { sc.next(); break; }
                    int returnId = sc.nextInt();

                    if (libraryMap.containsKey(returnId)) {
                        Book b = libraryMap.get(returnId);
                        if (b.isBorrowed) {
                            b.isBorrowed = false;
                            System.out.println("Return processed! Asset '" + b.title + "' restored to available status.");
                        } else {
                            System.out.println("Error: Ledger tracking indicates this item was never checked out.");
                        }
                    } else {
                        System.out.println("Invalid Book ID! Asset not found.");
                    }
                    break;

                case 6:
                    System.out.println("Exiting library catalog framework. Goodbye!");
                    exit = true;
                    break;

                default:
                    System.out.println("Invalid selection! Choose between numbers 1 and 6.");
            }
        }
        sc.close();
    }
}