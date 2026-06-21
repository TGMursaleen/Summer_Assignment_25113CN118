import java.util.Scanner;

public class Q81 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        
        int length = 0;

        // Traditional loop jisme koi unused variable ka warning nahi aayega
        for (int i = 0; i < str.toCharArray().length; i++) {
            length++;
        }
        
        System.out.println("String length without strlen(): " + length);
        
        sc.close();
    }
}