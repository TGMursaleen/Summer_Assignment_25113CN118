import java.util.Scanner;

public class Q117 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int maxStudents = 50;
        int[] rollNumbers = new int[maxStudents];
        String[] names = new String[maxStudents];
        double[] marks = new double[maxStudents];
        int count = 0;
        
        boolean exit = false;
        
        System.out.println("=== STUDENT RECORD SYSTEM ===");
        
        while (!exit) {
            System.out.println("\n--- MAIN MENU ---");
            System.out.println("1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Search by Roll Number");
            System.out.println("4. Exit");
            System.out.print("Enter choice (1-4): ");
            
            if (!sc.hasNextInt()) { sc.next(); continue; }
            int choice = sc.nextInt();
            
            switch (choice) {
                case 1:
                    if (count < maxStudents) {
                        System.out.print("Enter Roll Number: ");
                        rollNumbers[count] = sc.nextInt();
                        sc.nextLine(); 
                        System.out.print("Enter Name: ");
                        names[count] = sc.nextLine();
                        System.out.print("Enter Marks: ");
                        marks[count] = sc.nextDouble();
                        count++;
                        System.out.println("Student record added.");
                    } else {
                        System.out.println("Database is full.");
                    }
                    break;
                    
                case 2:
                    System.out.println("\n--- ALL RECORDS ---");
                    for (int i = 0; i < count; i++) {
                        System.out.println("Roll: " + rollNumbers[i] + " | Name: " + names[i] + " | Marks: " + marks[i]);
                    }
                    break;
                    
                case 3:
                    System.out.print("Enter Roll Number to search: ");
                    int searchRoll = sc.nextInt();
                    boolean found = false;
                    for (int i = 0; i < count; i++) {
                        if (rollNumbers[i] == searchRoll) {
                            System.out.println("Student found: " + names[i] + ", Marks: " + marks[i]);
                            found = true;
                            break;
                        }
                    }
                    if (!found) System.out.println("Student not found.");
                    break;
                    
                case 4:
                    exit = true;
                    break;
            }
        }
        sc.close();
    }
}