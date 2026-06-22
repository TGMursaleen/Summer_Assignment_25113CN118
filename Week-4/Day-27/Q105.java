import java.util.Scanner;
import java.util.HashMap;

class Student {
    String name;
    double percentage;

    Student(String name, double percentage) {
        this.name = name;
        this.percentage = percentage;
    }
}

public class Q105 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // HashMap gives O(1) time complexity for insertion and retrieval
        HashMap<Integer, Student> studentMap = new HashMap<>();
        boolean exit = false;
        
        System.out.println("=== OPTIMIZED STUDENT RECORD MANAGEMENT SYSTEM ===");
        
        while (!exit) {
            System.out.println("\n--- MAIN MENU ---");
            System.out.println("1. Add New Student");
            System.out.println("2. View All Student Records");
            System.out.println("3. Search Student by Roll Number");
            System.out.println("4. Exit");
            System.out.print("Enter your choice (1-4): ");
            
            if (!sc.hasNextInt()) {
                System.out.println("Invalid Option! Please enter a valid number between 1 and 4.");
                sc.next();
                continue;
            }
            
            int choice = sc.nextInt();
            
            switch (choice) {
                case 1:
                    int rollNumber = -1;
                    boolean validRoll = false;
                    
                    while (!validRoll) {
                        System.out.print("Enter Roll Number: ");
                        if (sc.hasNextInt()) {
                            rollNumber = sc.nextInt();
                            
                            // O(1) checking instead of O(N) loop
                            if (studentMap.containsKey(rollNumber)) {
                                System.out.println("Error: Roll Number already exists! Try a unique one.");
                            } else if (rollNumber <= 0) {
                                System.out.println("Error: Roll Number must be greater than 0.");
                            } else {
                                validRoll = true;
                            }
                        } else {
                            System.out.println("Invalid input! Roll number must be an integer.");
                            sc.next();
                        }
                    }
                    
                    System.out.print("Enter Student Name: ");
                    sc.nextLine(); // Clear buffer
                    String name = sc.nextLine();
                    
                    double percentage = -1;
                    boolean validPercentage = false;
                    while (!validPercentage) {
                        System.out.print("Enter Percentage (0.0 - 100.0): ");
                        if (sc.hasNextDouble()) {
                            percentage = sc.nextDouble();
                            if (percentage >= 0.0 && percentage <= 100.0) {
                                validPercentage = true;
                            } else {
                                System.out.println("Error: Percentage must be between 0.0 and 100.0.");
                            }
                        } else {
                            System.out.println("Invalid input! Percentage must be a numerical value.");
                            sc.next();
                        }
                    }
                    
                    // O(1) insertion complexity
                    studentMap.put(rollNumber, new Student(name, percentage));
                    System.out.println("Record added successfully!");
                    break;
                    
                case 2:
                    if (studentMap.isEmpty()) {
                        System.out.println("No records found in the database.");
                        break;
                    }
                    
                    System.out.println("\n--- ALL STUDENT RECORDS ---");
                    System.out.printf("%-10s %-20s %-10s\n", "Roll No", "Name", "Percentage");
                    System.out.println("------------------------------------------");
                    for (int roll : studentMap.keySet()) {
                        Student s = studentMap.get(roll);
                        System.out.printf("%-10d %-20s %-10.2f\n", roll, s.name, s.percentage);
                    }
                    break;
                    
                case 3:
                    System.out.print("Enter Roll Number to search: ");
                    if (!sc.hasNextInt()) {
                        System.out.println("Invalid search key! Roll number must be an integer.");
                        sc.next();
                        break;
                    }
                    
                    int searchRoll = sc.nextInt();
                    
                    // O(1) Instant lookup time complexity instead of O(N) linear scan
                    if (studentMap.containsKey(searchRoll)) {
                        Student s = studentMap.get(searchRoll);
                        System.out.println("\nRecord Found:");
                        System.out.println("Roll Number: " + searchRoll);
                        System.out.println("Name: " + s.name);
                        System.out.println("Percentage: " + s.percentage + "%");
                    } else {
                        System.out.println("Record not found for Roll Number: " + searchRoll);
                    }
                    break;
                    
                case 4:
                    System.out.println("Exiting the system. Goodbye!");
                    exit = true;
                    break;
                    
                default:
                    System.out.println("Invalid choice! Select an option between 1 and 4.");
            }
        }
        
        sc.close();
    }
}