import java.util.Scanner;

public class Q84 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string in lowercase: ");
        String str = sc.nextLine();

        char[] chars = str.toCharArray();

        System.out.print("Uppercase String: ");
        for (int i = 0; i < chars.length; i++) {
            char ch = chars[i];
            
            // Agar character lowercase alphabet hai, toh convert karein
            if (ch >= 'a' && ch <= 'z') {
                chars[i] = (char) (ch - 32);
            }
            
            System.out.print(chars[i]);
        }
        System.out.println();

        sc.close();
    }
}