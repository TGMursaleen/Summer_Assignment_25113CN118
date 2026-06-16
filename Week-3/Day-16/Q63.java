//Find Pair with given sum

import java.util.Scanner;
import java.util.Arrays;

public class Q63 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[100];
        int count = 0;

        System.out.println("Enter array elements (Press any alphabet to stop): ");
        while (sc.hasNextInt()) {
            if (count < arr.length) {
                arr[count] = sc.nextInt();
                count++;
            } else {
                break;
            }
        }
        
        //Scanner Buffer Safe (Alphabet flush)
        if (sc.hasNext()) {
            sc.next();
        }

        //Guard Clause 1: Empty or insufficient elements check
        if (count < 2) {
            System.out.println("Error: Need at least 2 elements to find a pair!");
            sc.close();
            return;
        }

        //Target Sum Input
        System.out.print("Enter the target sum you want to find: ");
        if (!sc.hasNextInt()) {
            System.out.println("Error: Invalid target sum!");
            sc.close();
            return;
        }
        int targetSum = sc.nextInt();

        //Step 1: Sorting essential for Two-Pointer approach
        Arrays.sort(arr, 0, count);

        //Step 2: Two-Pointer Implementation
        int left = 0;
        int right = count - 1;
        boolean pairFound = false;

        System.out.println("\n--- Pairs with sum " + targetSum + " ---");
        while (left < right) {
            int currentSum = arr[left] + arr[right];

            if (currentSum == targetSum) {
                System.out.println("Pair found: (" + arr[left] + ", " + arr[right] + ")");
                pairFound = true;
                left++;
                right--;
            } else if (currentSum < targetSum) {
                left++; // Sum chhota hai, bade values ki taraf badho
            } else {
                right--; // Sum bada hai, chhoti values ki taraf badho
            }
        }

        //Guard Clause 2: Pair nahi milne par handling
        if (!pairFound) {
            System.out.println("No pair found with the given target sum.");
        }

        sc.close();
    }
}