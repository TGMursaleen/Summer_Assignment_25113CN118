import java.util.Scanner;
import java.util.HashMap;

class Employee {
    String name;
    String department;
    double salary;

    Employee(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }
}

public class Q106 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, Employee> employeeMap = new HashMap<>();
        boolean exit = false;
        
        System.out.println("=== EMPLOYEE MANAGEMENT SYSTEM ===");
        
        while (!exit) {
            System.out.println("\n--- MAIN MENU ---");
            System.out.println("1. Add New Employee");
            System.out.println("2. View All Employee Records");
            System.out.println("3. Search Employee by ID");
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
                    int id = -1;
                    boolean validId = false;
                    while (!validId) {
                        System.out.print("Enter Employee ID: ");
                        if (sc.hasNextInt()) {
                            id = sc.nextInt();
                            if (employeeMap.containsKey(id)) {
                                System.out.println("Error: Employee ID already exists!");
                            } else if (id <= 0) {
                                System.out.println("Error: ID must be greater than 0.");
                            } else {
                                validId = true;
                            }
                        } else {
                            System.out.println("Invalid input! ID must be an integer.");
                            sc.next();
                        }
                    }
                    
                    System.out.print("Enter Employee Name: ");
                    sc.nextLine(); 
                    String name = sc.nextLine();
                    
                    System.out.print("Enter Department: ");
                    String department = sc.nextLine();
                    
                    double salary = -1;
                    boolean validSalary = false;
                    while (!validSalary) {
                        System.out.print("Enter Salary: ");
                        if (sc.hasNextDouble()) {
                            salary = sc.nextDouble();
                            if (salary >= 0) {
                                validSalary = true;
                            } else {
                                System.out.println("Error: Salary cannot be negative.");
                            }
                        } else {
                            System.out.println("Invalid input! Salary must be a numerical value.");
                            sc.next();
                        }
                    }
                    
                    employeeMap.put(id, new Employee(name, department, salary));
                    System.out.println("Employee record added successfully!");
                    break;
                    
                case 2:
                    if (employeeMap.isEmpty()) {
                        System.out.println("No records found in the system.");
                        break;
                    }
                    
                    System.out.println("\n--- ALL EMPLOYEE RECORDS ---");
                    System.out.printf("%-10s %-20s %-15s %-10s\n", "ID", "Name", "Department", "Salary");
                    System.out.println("------------------------------------------------------------");
                    for (int empId : employeeMap.keySet()) {
                        Employee emp = employeeMap.get(empId);
                        System.out.printf("%-10d %-20s %-15s %-10.2f\n", empId, emp.name, emp.department, emp.salary);
                    }
                    break;
                    
                case 3:
                    System.out.print("Enter Employee ID to search: ");
                    if (!sc.hasNextInt()) {
                        System.out.println("Invalid search key! ID must be an integer.");
                        sc.next();
                        break;
                    }
                    
                    int searchId = sc.nextInt();
                    
                    if (employeeMap.containsKey(searchId)) {
                        Employee emp = employeeMap.get(searchId);
                        System.out.println("\nRecord Found:");
                        System.out.println("ID: " + searchId);
                        System.out.println("Name: " + emp.name);
                        System.out.println("Department: " + emp.department);
                        System.out.println("Salary: Rs. " + emp.salary);
                    } else {
                        System.out.println("Record not found for Employee ID: " + searchId);
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