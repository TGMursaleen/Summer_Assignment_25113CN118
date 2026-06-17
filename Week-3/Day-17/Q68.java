// Q68: Find Common Elements
import java.util.Scanner;

public class Q68 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr1 = new int[100];
        int[] arr2 = new int[100];
        int count1 = 0, count2 = 0;

        // ---- STEP 1: DYNAMIC INPUT FOR BOTH ARRAYS ----
        System.out.println("Enter Array 1 Elements: (TO STOP PRESS ANY ALPHABET)");
        while (sc.hasNextInt() && count1 < 100) {
            arr1[count1++] = sc.nextInt();
        }
        sc.next(); // Buffer clear kiya

        System.out.println("Enter Array 2 Elements: (TO STOP PRESS ANY ALPHABET)");
        while (sc.hasNextInt() && count2 < 100) {
            arr2[count2++] = sc.nextInt();
        }
        sc.next(); // Final buffer clear

        // Guard Clause
        if (count1 == 0 || count2 == 0) {
            System.out.println("No common elements found!");
            sc.close();
            return;
        }

        // ---- STEP 2: COMPARE AND SAVE ALL MATCHES TO NEW ARRAY ----
        int[] tempCommon = new int[100];
        int commonCount = 0;

        for (int i = 0; i < count1; i++) {
            for (int j = 0; j < count2; j++) {
                if (arr1[i] == arr2[j]) {
                    // Jo bhi same mila, bina soche temporary array mein save kar lo
                    tempCommon[commonCount++] = arr1[i]; 
                }
            }
        }

        // ---- STEP 3: CHECK AND REMOVE DUPLICATES AT THE END ----
        if (commonCount == 0) {
            System.out.println("No common elements found!");
        } else {
            System.out.println("\nCommon elements in both arrays are: ");
            
            for (int i = 0; i < commonCount; i++) {
                boolean isDuplicate = false;
                
                // Pichle saare element check karo ki kya ye number pehle hi aa chuka hai?
                for (int k = 0; k < i; k++) {
                    if (tempCommon[i] == tempCommon[k]) {
                        isDuplicate = true;
                        break;
                    }
                }
                
                // Agar pehle nahi aaya, toh safely print kar do
                if (!isDuplicate) {
                    System.out.print(tempCommon[i] + " ");
                }
            }
            System.out.println(); // Formatting ke liye clear newline
        }

        sc.close();
    }
}