import java.util.Scanner;

public class Q115 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean exit = false;

        System.out.println("=== STRING OPERATIONS SYSTEM ===");

        while (!exit) {
            System.out.println("\n--- MAIN MENU ---");
            System.out.println("1. Get String Length");
            System.out.println("2. Concatenate Strings");
            System.out.println("3. Reverse String");
            System.out.println("4. Extract Substring");
            System.out.println("5. Exit");
            System.out.print("Enter your choice (1-5): ");

            if (!sc.hasNextInt()) {
                System.out.println("Invalid selection. Please enter a valid menu index.");
                sc.next();
                continue;
            }

            int choice = sc.nextInt();
            sc.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter string: ");
                    String s1 = sc.nextLine();
                    System.out.println("Length: " + s1.length());
                    break;
                case 2:
                    System.out.print("Enter first string: ");
                    String str1 = sc.nextLine();
                    System.out.print("Enter second string: ");
                    String str2 = sc.nextLine();
                    System.out.println("Result: " + (str1 + str2));
                    break;
                case 3:
                    System.out.print("Enter string: ");
                    String s3 = sc.nextLine();
                    StringBuilder sb = new StringBuilder(s3);
                    System.out.println("Reversed: " + sb.reverse().toString());
                    break;
                case 4:
                    System.out.print("Enter string: ");
                    String s4 = sc.nextLine();
                    System.out.print("Enter start index: ");
                    int start = sc.nextInt();
                    System.out.print("Enter end index: ");
                    int end = sc.nextInt();
                    try {
                        System.out.println("Substring: " + s4.substring(start, end));
                    } catch (Exception e) {
                        System.out.println("Error: Invalid index range.");
                    }
                    break;
                case 5:
                    exit = true;
                    System.out.println("Exiting system. Goodbye.");
                    break;
                default:
                    System.out.println("Invalid selection.");
            }
        }
        sc.close();
    }
}