import java.util.Scanner;

public class Q96 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String str = sc.nextLine();

        StringBuilder result = new StringBuilder();
        
        // ASCII characters (256) ko track karne ke liye boolean array
        boolean[] seen = new boolean[256];

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            
            // Agar yeh character pehle nahi dekha gaya hai (false hai)
            if (!seen[ch]) {
                seen[ch] = true; // Use true mark karein taaki dubara aaye toh skip ho sake
                result.append(ch); // Result mein jodein
            }
        }

        System.out.println("String after removing duplicates: " + result.toString());
        sc.close();
    }
}