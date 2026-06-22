import java.util.Scanner;
import java.util.Arrays;

public class Q91 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first string: ");
        String str1 = sc.nextLine();

        System.out.println("Enter second string: ");
        String str2 = sc.nextLine();

        // Case-sensitivity aur faltu spaces ka jhanjhat hatane ke liye
        str1 = str1.replaceAll("\\s+", "").toLowerCase();
        str2 = str2.replaceAll("\\s+", "").toLowerCase();

        // Agar length hi barabar nahi hai, toh anagram kabhi nahi ho sakta
        if (str1.length() != str2.length()) {
            System.out.println("The strings are not anagrams.");
            sc.close();
            return;
        }

        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();

        // Dono arrays ko sort karna
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        // Sorted arrays ko compare karna
        if (Arrays.equals(charArray1, charArray2)) {
            System.out.println("The strings are anagrams.");
        } else {
            System.out.println("The strings are not anagrams.");
        }

        sc.close();
    }
}