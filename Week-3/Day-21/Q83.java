import java.util.Scanner;

public class Q83 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String str = sc.nextLine();

        int vowels = 0;
        int consonants = 0;

        // Case-sensitivity ka jhanjhat khatam karne ke liye
        String lowerStr = str.toLowerCase();

        for (int i = 0; i < lowerStr.length(); i++) {
            char ch = lowerStr.charAt(i);

            // Sirf alphabets ko check karne ke liye (spaces ya special characters skip ho jayein)
            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        System.out.println("Total Vowels: " + vowels);
        System.out.println("Total Consonants: " + consonants);

        sc.close();
    }
}