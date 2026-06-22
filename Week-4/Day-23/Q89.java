import java.util.Scanner;

public class Q89 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String str = sc.nextLine();

        // 256 size ka array ASCII characters ki frequency track karne ke liye
        int[] countArray = new int[256];

        // Pehla loop: Sabhi characters ki ginti frequency array mein store karna
        for (int i = 0; i < str.length(); i++) {
            countArray[str.charAt(i)]++;
        }

        char result = ' ';
        // Dusra loop: String ko fir se check karna taaki pehla unique element mil sake
        for (int i = 0; i < str.length(); i++) {
            if (countArray[str.charAt(i)] == 1) {
                result = str.charAt(i);
                break;
            }
        }

        if (result != ' ') {
            System.out.println("First non-repeating character is: " + result);
        } else {
            System.out.println("All characters are repeating or string is empty.");
        }

        sc.close();
    }
}