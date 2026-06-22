import java.util.Scanner;

public class Q90 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String str = sc.nextLine();

        char result = ' ';

        // Har character ko baki bache characters se check karna
        for (int i = 0; i < str.length(); i++) {
            char current = str.charAt(i);
            
            // Spaces ko count nahi karenge
            if (current == ' ') {
                continue;
            }

            for (int j = i + 1; j < str.length(); j++) {
                if (current == str.charAt(j)) {
                    result = current;
                    break;
                }
            }

            // Jaise hi pehla repeating mil jaye, outer loop se exit karein
            if (result != ' ') {
                break;
            }
        }

        if (result != ' ') {
            System.out.println("First repeating character is: " + result);
        } else {
            System.out.println("No repeating characters found.");
        }

        sc.close();
    }
}