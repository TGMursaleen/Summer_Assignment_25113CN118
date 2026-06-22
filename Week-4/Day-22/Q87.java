import java.util.Scanner;

public class Q87 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String str = sc.nextLine();

        char[] chars = str.toCharArray();
        int[] freq = new int[chars.length];

        // Har character ki frequency count karna
        for (int i = 0; i < chars.length; i++) {
            freq[i] = 1;
            for (int j = i + 1; j < chars.length; j++) {
                if (chars[i] == chars[j]) {
                    freq[i]++;
                    // Duplicate character ko dubara count hone se bachane ke liye '0' mark karna
                    chars[j] = '0';
                }
            }
        }

        // Frequencies print karna
        System.out.println("\nCharacter frequencies: ");
        for (int i = 0; i < chars.length; i++) {
            // Agar character '0' ya space nahi hai, toh hi print karein
            if (chars[i] != '0' && chars[i] != ' ') {
                System.out.println(chars[i] + " -> " + freq[i]);
            }
        }

        sc.close();
    }
}