import java.util.Scanner;

public class Q103 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double balance = 5000.0; 
        boolean exit = false;
        
        System.out.println("=== WELCOME TO THE ATM SYSTEM ===");
        
        while (!exit) {
            System.out.println("\n--- ATM MENU ---");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print("Enter your choice (1-4): ");
            
            if (!sc.hasNextInt()) {
                System.out.println("Invalid Option! Please choose a number between 1 and 4.");
                sc.next(); 
                continue;
            }
            
            int choice = sc.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.println("Your Current Balance is: Rs. " + balance);
                    break;
                    
                case 2:
                    System.out.print("Enter amount to deposit: Rs. ");
                    double depositAmount = sc.nextDouble();
                    if (depositAmount > 0) {
                        balance += depositAmount;
                        System.out.println("Rs. " + depositAmount + " successfully deposited.");
                        System.out.println("New Balance: Rs. " + balance);
                    } else {
                        System.out.println("Invalid amount! Deposit must be greater than 0.");
                    }
                    break;
                    
                case 3:
                    System.out.print("Enter amount to withdraw: Rs. ");
                    double withdrawAmount = sc.nextDouble();
                    if (withdrawAmount <= 0) {
                        System.out.println("Invalid amount! Please enter a valid sum.");
                    } else if (withdrawAmount > balance) {
                        System.out.println("Insufficient Balance! Transaction denied.");
                    } else {
                        balance -= withdrawAmount;
                        System.out.println("Rs. " + withdrawAmount + " successfully withdrawn.");
                        System.out.println("Remaining Balance: Rs. " + balance);
                    }
                    break;
                    
                case 4:
                    System.out.println("Thank you for using our ATM. Have a great day!");
                    exit = true;
                    break;
                    
                default:
                    System.out.println("Invalid Option! Please choose a number between 1 and 4.");
            }
        }
        
        sc.close();
    }
}