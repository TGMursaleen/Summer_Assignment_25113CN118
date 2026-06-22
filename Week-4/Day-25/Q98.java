import java.util.Scanner;

public class Q98 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first string: ");
        String str1 = sc.nextLine();

        System.out.println("Enter second string: ");
        String str2 = sc.nextLine();

        // Pehli string ke unique characters track karne ke liye boolean array
        boolean[] presentInStr1 = new boolean[256];
        
        // Dusri string ke characters jo print ho chuke hain unhe track karne ke liye
        boolean[] alreadyPrinted = new boolean[256];

        // Step 1: Pehli string ke saare characters ko true mark karein
        for (int i = 0; i < str1.length(); i++) {
            presentInStr1[str1.charAt(i)] = true;
        }

        System.out.print("Common characters: ");
        boolean found = false;

        // Step 2: Dusri string ko scan karein aur check karein wo str1 mein hai ya nahi
        for (int i = 0; i < str2.length(); i++) {
            char ch = str2.charAt(i);

            // Spaces ko common characters mein count nahi karenge
            if (ch == ' ') {
                continue;
            }

            // Agar character str1 mein hai aur abhi tak print nahi hua hai
            if (presentInStr1[ch] && !alreadyPrinted[ch]) {
                System.out.print(ch + " ");
                alreadyPrinted[ch] = true; // Mark as printed taaki dubara repeat na ho
                found = true;
            }
        }

        if (!found) {
            System.out.print("No common characters found.");
        }
        System.out.println();

        sc.close();
    }
}