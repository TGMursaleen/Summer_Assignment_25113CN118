import java.util.Scanner;
import java.util.HashMap;

class StudentMarksheet {
    String name;
    int physicsMarks;
    int chemistryMarks;
    int mathematicsMarks;

    StudentMarksheet(String name, int physics, int chemistry, int math) {
        this.name = name;
        this.physicsMarks = physics;
        this.chemistryMarks = chemistry;
        this.mathematicsMarks = math;
    }

    int calculateTotal() {
        return physicsMarks + chemistryMarks + mathematicsMarks;
    }

    double calculatePercentage() {
        return (calculateTotal() / 300.0) * 100;
    }

    String evaluateDivision() {
        double pct = calculatePercentage();
        if (physicsMarks < 33 || chemistryMarks < 33 || mathematicsMarks < 33) {
            return "FAILED (Compartment)";
        } else if (pct >= 60.0) {
            return "First Division";
        } else if (pct >= 45.0) {
            return "Second Division";
        } else {
            return "Third Division";
        }
    }
}

public class Q108 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, StudentMarksheet> marksheetMap = new HashMap<>();
        boolean exit = false;

        System.out.println("=== MARKSHEET GENERATION SYSTEM ===");

        while (!exit) {
            System.out.println("\n--- MAIN MENU ---");
            System.out.println("1. Enter Student Marks Entry");
            System.out.println("2. Generate Marksheet Report Card");
            System.out.println("3. View Consolidated Class Ledger");
            System.out.println("4. Exit");
            System.out.print("Enter your choice (1-4): ");

            if (!sc.hasNextInt()) {
                System.out.println("Invalid Option! Enter a valid menu index integer.");
                sc.next();
                continue;
            }

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Roll Number: ");
                    if (!sc.hasNextInt()) { System.out.println("Invalid Roll Number entry!"); sc.next(); break; }
                    int roll = sc.nextInt();
                    if (roll <= 0) { System.out.println("Roll Number must be greater than 0."); break; }

                    sc.nextLine(); 
                    System.out.print("Enter Student Full Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Physics Marks (0-100): ");
                    if (!sc.hasNextInt()) { sc.next(); break; }
                    int p = sc.nextInt();

                    System.out.print("Enter Chemistry Marks (0-100): ");
                    if (!sc.hasNextInt()) { sc.next(); break; }
                    int c = sc.nextInt();

                    System.out.print("Enter Mathematics Marks (0-100): ");
                    if (!sc.hasNextInt()) { sc.next(); break; }
                    int m = sc.nextInt();

                    if (p < 0 || p > 100 || c < 0 || c > 100 || m < 0 || m > 100) {
                        System.out.println("Error: Examination evaluation metrics must sit between 0 and 100.");
                        break;
                    }

                    marksheetMap.put(roll, new StudentMarksheet(name, p, c, m));
                    System.out.println("Examination record indexed successfully!");
                    break;

                case 2:
                    System.out.print("Enter Roll Number to generate marksheet: ");
                    if (!sc.hasNextInt()) { sc.next(); break; }
                    int searchRoll = sc.nextInt();

                    if (marksheetMap.containsKey(searchRoll)) {
                        StudentMarksheet sm = marksheetMap.get(searchRoll);
                        System.out.println("\n==================================================");
                        System.out.println("            OFFICIAL ACADEMIC MARKSHEET           ");
                        System.out.println("==================================================");
                        System.out.println("Roll Number : " + searchRoll);
                        System.out.println("Student Name: " + sm.name);
                        System.out.println("--------------------------------------------------");
                        System.out.printf("%-20s %-15s %-15s\n", "Subject Name", "Max Marks", "Marks Obtained");
                        System.out.println("--------------------------------------------------");
                        System.out.printf("%-20s %-15d %-15d\n", "Physics", 100, sm.physicsMarks);
                        System.out.printf("%-20s %-15d %-15d\n", "Chemistry", 100, sm.chemistryMarks);
                        System.out.printf("%-20s %-15d %-15d\n", "Mathematics", 100, sm.mathematicsMarks);
                        System.out.println("--------------------------------------------------");
                        System.out.printf("Aggregate Total: %-10d Out of: %-10d\n", sm.calculateTotal(), 300);
                        System.out.printf("Percentage     : %.2f%%\n", sm.calculatePercentage());
                        System.out.println("Final Result   : " + sm.evaluateDivision());
                        System.out.println("==================================================");
                    } else {
                        System.out.println("No records matches Roll Number: " + searchRoll);
                    }
                    break;

                case 3:
                    if (marksheetMap.isEmpty()) {
                        System.out.println("No examination profiles populated in system ledger map.");
                        break;
                    }

                    System.out.println("\n--- CONSOLIDATED MARKS LEDGER ---");
                    System.out.printf("%-10s %-20s %-7s %-7s %-7s %-7s %-7s\n", "Roll No", "Name", "Phy", "Chem", "Math", "Total", "Pct(%)");
                    System.out.println("----------------------------------------------------------------------");
                    for (int r : marksheetMap.keySet()) {
                        StudentMarksheet sm = marksheetMap.get(r);
                        System.out.printf("%-10d %-20s %-7d %-7d %-7d %-7d %-7.2f\n", 
                            r, sm.name, sm.physicsMarks, sm.chemistryMarks, sm.mathematicsMarks, sm.calculateTotal(), sm.calculatePercentage());
                    }
                    break;

                case 4:
                    System.out.println("Exiting the academic framework engine. Goodbye!");
                    exit = true;
                    break;

                default:
                    System.out.println("Invalid selection index input parameter.");
            }
        }
        sc.close();
    }
}