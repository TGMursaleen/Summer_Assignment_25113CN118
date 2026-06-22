import java.util.Scanner;

public class Q102 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("=== VOTING ELIGIBILITY SYSTEM ===");
        System.out.print("Apni age enter karo: ");
        
        if (!sc.hasNextInt()) {
            System.out.println("Error: Please ek valid number enter karo!");
            sc.close();
            return;
        }
        
        int age = sc.nextInt();
        
        if (age < 0) {
            System.out.println("Error: Age negative nahi ho sakti!");
        } else if (age >= 18) {
            System.out.println("Aap vote dalne ke liye ELIGIBLE hain!");
        } else {
            int yearsLeft = 18 - age;
            System.out.println("Aap eligible nahi hain. Aapko vote karne ke liye " + yearsLeft + " saal aur wait karna hoga.");
        }
        
        sc.close();
    }
}