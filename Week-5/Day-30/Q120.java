import java.util.Scanner;

public class Q120 {
    static int maxBooks = 10;
    static String[] titles = new String[maxBooks];
    static String[] authors = new String[maxBooks];
    static int count = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("\n--- MINI LIBRARY SYSTEM ---");
            System.out.println("1. Add Book\n2. Show Catalog\n3. Search Book\n4. Exit");
            System.out.print("Select an option: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1: addBook(sc); break;
                case 2: showCatalog(); break;
                case 3: searchBook(sc); break;
                case 4: exit = true; break;
                default: System.out.println("Invalid input.");
            }
        }
        sc.close();
    }

    public static void addBook(Scanner sc) {
        if (count < maxBooks) {
            System.out.print("Title: "); titles[count] = sc.nextLine();
            System.out.print("Author: "); authors[count] = sc.nextLine();
            count++;
            System.out.println("Book added.");
        } else {
            System.out.println("Library full.");
        }
    }

    public static void showCatalog() {
        System.out.println("\n--- CATALOG ---");
        for (int i = 0; i < count; i++) {
            System.out.println((i + 1) + ". " + titles[i] + " by " + authors[i]);
        }
    }

    public static void searchBook(Scanner sc) {
        System.out.print("Enter title to search: ");
        String query = sc.nextLine();
        boolean found = false;
        for (int i = 0; i < count; i++) {
            if (titles[i].equalsIgnoreCase(query)) {
                System.out.println("Found: " + titles[i] + " by " + authors[i]);
                found = true;
                break;
            }
        }
        if (!found) System.out.println("Book not found.");
    }
}