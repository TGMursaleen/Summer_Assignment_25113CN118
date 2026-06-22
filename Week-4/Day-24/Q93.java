import java.util.Scanner;

public class Q93 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first string: ");
        String str1 = sc.nextLine();

        System.out.println("Enter second string: ");
        String str2 = sc.nextLine();

        // Edge case: Agar lengths barabar nahi hain, toh rotation nahi ho sakti
        if (str1.length() != str2.length()) {
            System.out.println("The strings are not rotations of each other.");
            sc.close();
            return;
        }

        // String ko khud se jodne par saari possible rotations ban jaati hain
        String concatenated = str1 + str1;

        // Check karna ki kya naye string mein str2 majood hai
        if (concatenated.contains(str2)) {
            System.out.println("The strings are rotations of each other.");
        } else {
            System.out.println("The strings are not rotations of each other.");
        }

        sc.close();
    }
}