//Merger of Array

import java.util.Scanner;

public class Q65 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] arr1 = new int[100];
        int[] arr2 = new int[100];
        int count1 = 0;
        int count2 = 0;

        //Step 1: First Array Input
        System.out.println("Enter elements for FIRST array (Press any alphabet to stop): ");
        while (sc.hasNextInt() && count1<100) {
            arr1[count1] = sc.nextInt();
            count1++;
        }
        
        sc.next();

        //Step 2: Second Array Input
        System.out.println("Enter elements for SECOND array (Press any alphabet to stop): ");
        while (sc.hasNextInt() && count2<100) {
            arr2[count2] = sc.nextInt();
            count2++;
        }

        //Clear the second alphabet trigger from scanner buffer
        sc.next();

        //Both arrays empty check
        if (count1 == 0 && count2 == 0) {
            System.out.println("Error: Both arrays are empty! Nothing to merge.");
            sc.close();
            return;
        }

        //Step 3: Create Resultant Merged Array
        int[] mergedArr = new int[count1 + count2];
        int k = 0; // Merged array tracker index

        // Copying first array elements
        for (int i = 0; i < count1; i++) {
            mergedArr[k] = arr1[i];
            k++;
        }

        // Copying second array elements
        for (int i = 0; i < count2; i++) {
            mergedArr[k] = arr2[i];
            k++;
        }

        //Step 4: Clean Output Display
        System.out.println("\n--- Merged Array Result ---");
        for (int i = 0; i < mergedArr.length; i++) {
            System.out.print(mergedArr[i] + " ");
        }
        System.out.println();

        sc.close();
    }
}