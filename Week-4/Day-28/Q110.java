import java.util.Scanner;
import java.util.HashMap;

class BankAccount {
    String accountHolderName;
    double balance;

    BankAccount(String name, double initialDeposit) {
        this.accountHolderName = name;
        this.balance = initialDeposit;
    }
}

public class Q110 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, BankAccount> accountMap = new HashMap<>();
        boolean exit = false;

        System.out.println("=== BANK ACCOUNT MANAGEMENT SYSTEM ===");

        while (!exit) {
            System.out.println("\n--- MAIN MENU ---");
            System.out.println("1. Create New Account");
            System.out.println("2. Deposit Funds");
            System.out.println("3. Withdraw Funds");
            System.out.println("4. Check Account Balance");
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
                    System.out.print("Enter Account Number: ");
                    int accNum = sc.nextInt();
                    if (accountMap.containsKey(accNum)) {
                        System.out.println("Error: Account number already exists.");
                        break;
                    }
                    sc.nextLine();
                    System.out.print("Enter Holder Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Initial Deposit: Rs. ");
                    double initial = sc.nextDouble();
                    accountMap.put(accNum, new BankAccount(name, initial));
                    System.out.println("Account created successfully.");
                    break;

                case 2:
                    System.out.print("Enter Account Number: ");
                    int depAcc = sc.nextInt();
                    if (accountMap.containsKey(depAcc)) {
                        System.out.print("Enter Deposit Amount: Rs. ");
                        double amt = sc.nextDouble();
                        BankAccount acc = accountMap.get(depAcc);
                        acc.balance += amt;
                        System.out.println("Deposit successful. New Balance: Rs. " + acc.balance);
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;

                case 3:
                    System.out.print("Enter Account Number: ");
                    int witAcc = sc.nextInt();
                    if (accountMap.containsKey(witAcc)) {
                        System.out.print("Enter Withdrawal Amount: Rs. ");
                        double amt = sc.nextDouble();
                        BankAccount acc = accountMap.get(witAcc);
                        if (acc.balance >= amt) {
                            acc.balance -= amt;
                            System.out.println("Withdrawal successful. Remaining Balance: Rs. " + acc.balance);
                        } else {
                            System.out.println("Insufficient funds.");
                        }
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;

                case 4:
                    System.out.print("Enter Account Number: ");
                    int balAcc = sc.nextInt();
                    if (accountMap.containsKey(balAcc)) {
                        BankAccount acc = accountMap.get(balAcc);
                        System.out.println("Holder: " + acc.accountHolderName + " | Balance: Rs. " + acc.balance);
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;

                case 5:
                    exit = true;
                    System.out.println("Exiting banking system. Goodbye.");
                    break;

                default:
                    System.out.println("Invalid selection.");
            }
        }
        sc.close();
    }
}