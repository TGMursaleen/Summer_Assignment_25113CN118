// Q67: Intersection of Two Arrays
import java.util.Scanner;

public class Q67 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr1 = new int[100];
        int[] arr2 = new int[100];
        int count1 = 0, count2 = 0;

        // ---- STEP 1: INPUT BOTH ARRAYS ----
        System.out.println("Enter Array 1 Elements: (TO STOP PRESS ANY ALPHABET)");
        while (sc.hasNextInt() && count1 < 100) {
            arr1[count1++] = sc.nextInt();
        }
        if (sc.hasNext()) sc.next(); // Buffer clear

        System.out.println("Enter Array 2 Elements: (TO STOP PRESS ANY ALPHABET)");
        while (sc.hasNextInt() && count2 < 100) {
            arr2[count2++] = sc.nextInt();
        }
        if (sc.hasNext()) sc.next(); // Final Buffer clear

        // Guard Clause
        if (count1 == 0 || count2 == 0) {
            System.out.println("No common elements found!");
            sc.close();
            return;
        }

        // ---- STEP 2: CHECK EVERY ELEMENT (Nested Loop) ----
        int[] tempIntersection = new int[100];
        int tempCount = 0;

        for (int i = 0; i < count1; i++) {
            for (int j = 0; j < count2; j++) {
                if (arr1[i] == arr2[j]) {
                    // Match mil gaya! Use temporary array mein daal do
                    tempIntersection[tempCount++] = arr1[i];
                    break; // Ek match milne par loop break karein taaki array 2 ke duplicates repeat na hon
                }
            }
        }

        // ---- STEP 3: FINAL DUPLICATE REMOVAL & PRINT ----
        if (tempCount == 0) {
            System.out.println("No common elements found!");
        } else {
            System.out.println("\nIntersection of the two arrays is: ");
            
            for (int i = 0; i < tempCount; i++) {
                boolean isDuplicate = false;
                
                // Check karo ki kya ye element pehle hi print ho chuka hai?
                for (int k = 0; k < i; k++) {
                    if (tempIntersection[i] == tempIntersection[k]) {
                        isDuplicate = true;
                        break;
                    }
                }
                
                // Agar pehle nahi aaya, toh print kar do!
                if (!isDuplicate) {
                    System.out.print(tempIntersection[i] + " ");
                }
            }
            System.out.println();
        }

        sc.close();
    }
}