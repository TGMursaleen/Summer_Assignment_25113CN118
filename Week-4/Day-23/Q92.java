import java.util.Scanner;

public class Q92 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String str = sc.nextLine();

        // Sabhi ASCII characters ki frequency store karne ke liye array
        int[] freq = new int[256];

        // Har character ki frequency store karna
        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)]++;
        }

        int maxCount = -1;
        char maxChar = ' ';

        // Maximum occurring character dhoondhna
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            
            // Spaces ko skip karne ke liye (agar sirf words ka char chahiye)
            if (ch == ' ') {
                continue;
            }

            if (freq[ch] > maxCount) {
                maxCount = freq[ch];
                maxChar = ch;
            }
        }

        if (maxChar != ' ') {
            System.out.println("Maximum occurring character is '" + maxChar + "' which appears " + maxCount + " times.");
        } else {
            System.out.println("String is empty or contains only spaces.");
        }

        sc.close();
    }
}