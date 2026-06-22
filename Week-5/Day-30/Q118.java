import java.util.Scanner;

public class Q118 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int maxBooks = 10;
        String[] bookTitles = new String[maxBooks];
        String[] bookAuthors = new String[maxBooks];
        boolean[] isBorrowed = new boolean[maxBooks];
        int bookCount = 0;
        
        boolean exit = false;
        
        System.out.println("=== MINI LIBRARY SYSTEM ===");
        
        while (!exit) {
            System.out.println("\n--- MAIN MENU ---");
            System.out.println("1. Add Book");
            System.out.println("2. Display Library Catalog");
            System.out.println("3. Borrow Book");
            System.out.println("4. Return Book");
            System.out.println("5. Exit");
            System.out.print("Enter choice (1-5): ");
            
            if (!sc.hasNextInt()) { sc.next(); continue; }
            int choice = sc.nextInt();
            sc.nextLine(); 
            
            switch (choice) {
                case 1:
                    if (bookCount < maxBooks) {
                        System.out.print("Enter Book Title: ");
                        bookTitles[bookCount] = sc.nextLine();
                        System.out.print("Enter Author: ");
                        bookAuthors[bookCount] = sc.nextLine();
                        isBorrowed[bookCount] = false;
                        bookCount++;
                        System.out.println("Book added successfully.");
                    } else {
                        System.out.println("Library catalog is full.");
                    }
                    break;
                    
                case 2:
                    System.out.println("\n--- CATALOG ---");
                    for (int i = 0; i < bookCount; i++) {
                        String status = isBorrowed[i] ? "Borrowed" : "Available";
                        System.out.println((i + 1) + ". " + bookTitles[i] + " by " + bookAuthors[i] + " [" + status + "]");
                    }
                    break;
                    
                case 3:
                    System.out.print("Enter book number to borrow: ");
                    int bIdx = sc.nextInt() - 1;
                    if (bIdx >= 0 && bIdx < bookCount && !isBorrowed[bIdx]) {
                        isBorrowed[bIdx] = true;
                        System.out.println("Book borrowed successfully.");
                    } else {
                        System.out.println("Book unavailable or index invalid.");
                    }
                    break;
                    
                case 4:
                    System.out.print("Enter book number to return: ");
                    int rIdx = sc.nextInt() - 1;
                    if (rIdx >= 0 && rIdx < bookCount && isBorrowed[rIdx]) {
                        isBorrowed[rIdx] = false;
                        System.out.println("Book returned successfully.");
                    } else {
                        System.out.println("Invalid index or book was not borrowed.");
                    }
                    break;
                    
                case 5:
                    exit = true;
                    break;
            }
        }
        sc.close();
    }
}