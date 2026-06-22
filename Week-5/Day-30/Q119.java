import java.util.Scanner;

public class Q119 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int maxEmployees = 10;
        int[] ids = new int[maxEmployees];
        String[] names = new String[maxEmployees];
        double[] salaries = new double[maxEmployees];
        int count = 0;
        
        boolean exit = false;
        
        System.out.println("=== MINI EMPLOYEE MANAGEMENT SYSTEM ===");
        
        while (!exit) {
            System.out.println("\n--- MAIN MENU ---");
            System.out.println("1. Add Employee");
            System.out.println("2. Display All Employees");
            System.out.println("3. Search Employee by ID");
            System.out.println("4. Exit");
            System.out.print("Enter choice (1-4): ");
            
            if (!sc.hasNextInt()) { sc.next(); continue; }
            int choice = sc.nextInt();
            
            switch (choice) {
                case 1:
                    if (count < maxEmployees) {
                        System.out.print("Enter ID: ");
                        ids[count] = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Enter Name: ");
                        names[count] = sc.nextLine();
                        System.out.print("Enter Salary: ");
                        salaries[count] = sc.nextDouble();
                        count++;
                        System.out.println("Employee added successfully.");
                    } else {
                        System.out.println("System memory full.");
                    }
                    break;
                    
                case 2:
                    System.out.println("\n--- EMPLOYEE LIST ---");
                    for (int i = 0; i < count; i++) {
                        System.out.println("ID: " + ids[i] + " | Name: " + names[i] + " | Salary: " + salaries[i]);
                    }
                    break;
                    
                case 3:
                    System.out.print("Enter ID to search: ");
                    int searchId = sc.nextInt();
                    boolean found = false;
                    for (int i = 0; i < count; i++) {
                        if (ids[i] == searchId) {
                            System.out.println("Found: " + names[i] + ", Salary: " + salaries[i]);
                            found = true;
                            break;
                        }
                    }
                    if (!found) System.out.println("Employee not found.");
                    break;
                    
                case 4:
                    exit = true;
                    break;
            }
        }
        sc.close();
    }
}