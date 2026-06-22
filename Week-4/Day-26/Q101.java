import java.util.Scanner;
import java.util.Random;

public class Q101 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        
        // 1 se 100 ke beech random number generate karega
        int targetNumber = random.nextInt(100) + 1;
        int attempts = 0;
        int guess = 0;
        
        System.out.println("=== WELCOME TO THE NUMBER GUESSING GAME ===");
        System.out.println("Maine 1 se 100 ke beech ek number socha hai. Guess karo!");
        
        // Game tab tak chalega jab tak user sahi guess nahi kar leta
        while (guess != targetNumber) {
            System.out.print("\nApna guess enter karo: ");
            
            // Input validation: Check ki user ne number hi daala hai ya nahi
            if (!sc.hasNextInt()) {
                System.out.println("Please ek valid number daalo!");
                sc.next(); 
                continue;
            }
            
            guess = sc.nextInt();
            attempts++;
            
            if (guess < targetNumber) {
                System.out.println("Too Low! Thoda bada number try karo.");
            } else if (guess > targetNumber) {
                System.out.println("Too High! Thoda chota number try karo.");
            } else {
                System.out.println("\nOho! Sahi jawab!");
                System.out.println("Tumne " + attempts + " attempts mein sahi guess kiya!");
            }
        }
        
        sc.close();
    }
}