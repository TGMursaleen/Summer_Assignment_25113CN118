import java.util.Scanner;

public class Q94 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string to compress: ");
        String str = sc.nextLine();

        if (str.isEmpty()) {
            System.out.println("Compressed string: ");
            sc.close();
            return;
        }

        StringBuilder compressed = new StringBuilder();
        int count = 1;

        for (int i = 0; i < str.length(); i++) {
            // Agar agla character same hai, toh count badhayein
            if (i + 1 < str.length() && str.charAt(i) == str.charAt(i + 1)) {
                count++;
            } else {
                // Jaise hi naya character aaye ya string khatam ho, append karein
                compressed.append(str.charAt(i));
                compressed.append(count);
                count = 1; // Count reset naye character ke liye
            }
        }

        System.out.println("Compressed string: " + compressed.toString());
        sc.close();
    }
}