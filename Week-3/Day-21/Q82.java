import java.util.Scanner;

public class Q82 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String str = sc.nextLine();

        char[] chars = str.toCharArray();

        System.out.print("Reversed string: ");
        for (int i = chars.length - 1; i >= 0; i--) {
            System.out.print(chars[i]);
        }
        System.out.println();

        sc.close();
    }
}