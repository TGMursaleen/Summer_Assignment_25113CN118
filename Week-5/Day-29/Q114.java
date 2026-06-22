import java.util.Scanner;

public class Q114 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[100];
        int size = 0;
        boolean exit = false;

        System.out.println("=== ARRAY OPERATIONS SYSTEM ===");

        while (!exit) {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Insert Element");
            System.out.println("2. Display Array");
            System.out.println("3. Search Element");
            System.out.println("4. Delete Element");
            System.out.println("5. Exit");
            System.out.print("Enter choice (1-5): ");

            if (!sc.hasNextInt()) { sc.next(); continue; }
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter element to insert: ");
                    arr[size++] = sc.nextInt();
                    System.out.println("Element added.");
                    break;
                case 2:
                    System.out.print("Array elements: ");
                    for (int i = 0; i < size; i++) System.out.print(arr[i] + " ");
                    System.out.println();
                    break;
                case 3:
                    System.out.print("Enter element to search: ");
                    int key = sc.nextInt();
                    int found = -1;
                    for (int i = 0; i < size; i++) {
                        if (arr[i] == key) { found = i; break; }
                    }
                    System.out.println(found != -1 ? "Element found at index: " + found : "Element not found.");
                    break;
                case 4:
                    System.out.print("Enter index to delete: ");
                    int idx = sc.nextInt();
                    if (idx >= 0 && idx < size) {
                        for (int i = idx; i < size - 1; i++) arr[i] = arr[i + 1];
                        size--;
                        System.out.println("Element deleted.");
                    } else {
                        System.out.println("Invalid index.");
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