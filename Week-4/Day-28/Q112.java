import java.util.Scanner;
import java.util.HashMap;

class Contact {
    String name;
    String phoneNumber;
    String email;

    Contact(String name, String phoneNumber, String email) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }
}

public class Q112 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, Contact> contactMap = new HashMap<>();
        boolean exit = false;

        System.out.println("=== CONTACT MANAGEMENT SYSTEM ===");

        while (!exit) {
            System.out.println("\n--- MAIN MENU ---");
            System.out.println("1. Add New Contact");
            System.out.println("2. View All Contacts");
            System.out.println("3. Search Contact by ID");
            System.out.println("4. Delete Contact");
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
                    System.out.print("Enter Contact ID: ");
                    int id = sc.nextInt();
                    if (contactMap.containsKey(id)) {
                        System.out.println("Error: Contact ID already exists.");
                        break;
                    }
                    sc.nextLine();
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Phone Number: ");
                    String phone = sc.nextLine();
                    System.out.print("Enter Email: ");
                    String email = sc.nextLine();
                    contactMap.put(id, new Contact(name, phone, email));
                    System.out.println("Contact added successfully.");
                    break;

                case 2:
                    if (contactMap.isEmpty()) {
                        System.out.println("Contact list is empty.");
                        break;
                    }
                    System.out.println("\n--- ALL CONTACTS ---");
                    for (int contactId : contactMap.keySet()) {
                        Contact c = contactMap.get(contactId);
                        System.out.println("ID: " + contactId + " | Name: " + c.name + " | Phone: " + c.phoneNumber + " | Email: " + c.email);
                    }
                    break;

                case 3:
                    System.out.print("Enter Contact ID to search: ");
                    int searchId = sc.nextInt();
                    if (contactMap.containsKey(searchId)) {
                        Contact c = contactMap.get(searchId);
                        System.out.println("Name: " + c.name + " | Phone: " + c.phoneNumber + " | Email: " + c.email);
                    } else {
                        System.out.println("Contact not found.");
                    }
                    break;

                case 4:
                    System.out.print("Enter Contact ID to delete: ");
                    int delId = sc.nextInt();
                    if (contactMap.remove(delId) != null) {
                        System.out.println("Contact deleted successfully.");
                    } else {
                        System.out.println("Contact ID not found.");
                    }
                    break;

                case 5:
                    exit = true;
                    System.out.println("Exiting contact system. Goodbye.");
                    break;

                default:
                    System.out.println("Invalid selection.");
            }
        }
        sc.close();
    }
}