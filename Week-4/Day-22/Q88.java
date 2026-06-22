import java.util.Scanner;

public class Q88 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string with spaces: ");
        String str = sc.nextLine();

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            
            // Agar character space nahi hai, toh result mein jodein
            if (ch != ' ') {
                result.append(ch);
            }
        }

        System.out.println("String after removing spaces: " + result.toString());
        
        sc.close();
    }
}