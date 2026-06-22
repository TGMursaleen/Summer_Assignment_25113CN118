import java.util.Scanner;
import java.util.HashMap;

class SalaryRecord {
    String name;
    double baseSalary;
    double allowances;
    double deductions;

    SalaryRecord(String name, double baseSalary, double allowances, double deductions) {
        this.name = name;
        this.baseSalary = baseSalary;
        this.allowances = allowances;
        this.deductions = deductions;
    }

    double calculateNetSalary() {
        return (baseSalary + allowances) - deductions;
    }
}

public class Q107 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, SalaryRecord> salaryMap = new HashMap<>();
        boolean exit = false;

        System.out.println("=== SALARY MANAGEMENT SYSTEM ===");

        while (!exit) {
            System.out.println("\n--- MAIN MENU ---");
            System.out.println("1. Add/Update Salary Structure");
            System.out.println("2. Display Salary Slips (All Employees)");
            System.out.println("3. Fetch Specific Net Salary Breakdown");
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
                    System.out.print("Enter Employee ID: ");
                    if (!sc.hasNextInt()) {
                        System.out.println("Invalid ID! Must be an integer.");
                        sc.next();
                        break;
                    }
                    int id = sc.nextInt();
                    if (id <= 0) {
                        System.out.println("Error: ID must be greater than 0.");
                        break;
                    }

                    sc.nextLine(); 
                    System.out.print("Enter Employee Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Base Salary: Rs. ");
                    if (!sc.hasNextDouble()) { System.out.println("Invalid amount!"); sc.next(); break; }
                    double base = sc.nextDouble();

                    System.out.print("Enter Monthly Allowances: Rs. ");
                    if (!sc.hasNextDouble()) { System.out.println("Invalid amount!"); sc.next(); break; }
                    double allowances = sc.nextDouble();

                    System.out.print("Enter Monthly Deductions (Tax/PF): Rs. ");
                    if (!sc.hasNextDouble()) { System.out.println("Invalid amount!"); sc.next(); break; }
                    double deductions = sc.nextDouble();

                    if (base < 0 || allowances < 0 || deductions < 0) {
                        System.out.println("Error: Financial parameters cannot be negative values.");
                        break;
                    }

                    salaryMap.put(id, new SalaryRecord(name, base, allowances, deductions));
                    System.out.println("Salary configuration processed successfully!");
                    break;

                case 2:
                    if (salaryMap.isEmpty()) {
                        System.out.println("No salary configurations initialized in system database.");
                        break;
                    }

                    System.out.println("\n--- EMPLOYEES PAYROLL SUMMARY ---");
                    System.out.printf("%-10s %-20s %-12s %-12s %-12s %-12s\n", "ID", "Name", "Base", "Allowances", "Deductions", "Net Salary");
                    System.out.println("--------------------------------------------------------------------------------");
                    for (int empId : salaryMap.keySet()) {
                        SalaryRecord record = salaryMap.get(empId);
                        System.out.printf("%-10d %-20s %-12.2f %-12.2f %-12.2f %-12.2f\n", 
                            empId, record.name, record.baseSalary, record.allowances, record.deductions, record.calculateNetSalary());
                    }
                    break;

                case 3:
                    System.out.print("Enter Employee ID to fetch breakdown: ");
                    if (!sc.hasNextInt()) {
                        System.out.println("Invalid ID format!");
                        sc.next();
                        break;
                    }
                    int searchId = sc.nextInt();

                    if (salaryMap.containsKey(searchId)) {
                        SalaryRecord record = salaryMap.get(searchId);
                        System.out.println("\n--- DETAILED SALARY SLIP ---");
                        System.out.println("Employee ID     : " + searchId);
                        System.out.println("Employee Name   : " + record.name);
                        System.out.println("Gross Base Pay  : Rs. " + record.baseSalary);
                        System.out.println("Total Allowances: Rs. " + record.allowances);
                        System.out.println("Total Deductions: Rs. " + record.deductions);
                        System.out.println("----------------------------");
                        System.out.println("Take Home Salary: Rs. " + record.calculateNetSalary());
                    } else {
                        System.out.println("No salary allocation matches Employee ID: " + searchId);
                    }
                    break;

                case 4:
                    System.out.println("Exiting the payroll management framework. Goodbye!");
                    exit = true;
                    break;

                default:
                    System.out.println("Invalid choice! Choose between alternative menu indexes (1-4).");
            }
        }
        sc.close();
    }
}