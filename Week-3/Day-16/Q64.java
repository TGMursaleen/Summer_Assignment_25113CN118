//Remove Duplicates from Array

import java.util.Scanner;
import java.util.Arrays;

public class Q64 {
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
        
        //Scanner Buffer Safe (Alphabet flush pipeline clear karne ke liye)
        if (sc.hasNext()) {
            sc.next();
        }

        //Guard Clause: Empty array entries safeguard
        if (count == 0) {
            System.out.println("Error: Array is empty! No elements to process.");
            sc.close();
            return;
        }

        //Step 1: Range sorting (Bache huye default 0s disturb nahi honge)
        Arrays.sort(arr, 0, count);

        //Step 2: Two-Pointer Overwriting Logic
        int uniqueIndex = 0;

        for (int i = 0; i < count; i++) {
            // Agar current element padosi ke barabar hai, toh loop ko aage badhao (Skip duplicate)
            if (i < count - 1 && arr[i] == arr[i + 1]) {
                continue;
            }
            // Unique element mila, use array ke shuruat mein rewrite karo
            arr[uniqueIndex] = arr[i];
            uniqueIndex++;
        }

        //Step 3: Clean Output Display (Sirf uniqueIndex tak hi print karenge)
        System.out.println("\nArray after removing duplicates: ");
        for (int i = 0; i < uniqueIndex; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        sc.close();
    }
}