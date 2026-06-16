//Finding Max Frequency Element

import java.util.Arrays;
import java.util.Scanner;

public class Q62 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[100];
        int count = 0;

        System.out.println("Enter array elements (Press any alphabet to stop): ");
        //Dynamic Input Loop with explicit boundary limit
        while (sc.hasNextInt()) {
            if (count < arr.length) {
                arr[count] = sc.nextInt();
                count++;
            } else {
                break;
            }
        }
        
        //Scanner Buffer Bug Safe: Alphabet flush pipeline clear karne ke liye
        sc.next();

        //Guard Clause: Empty array entries safeguard (Graceful Exit)
        if (count == 0) {
            System.out.println("Error: Array is empty! No elements to process.");
            sc.close();
            return;
        }

        //Step 1: Range Sorting (Sirf filled elements sort honge, default 0s touch nahi honge)
        Arrays.sort(arr, 0, count);

        //Step 2: Single-Pass Linear Max Frequency Trackers
        int maxElement = arr[0];
        int maxCount = 1;
        int currentCount = 1;

        //Padosi elements ko line se compare karne wala loop
        for (int i = 1; i < count; i++) {
            if (arr[i] == arr[i - 1]) {
                currentCount++; // Padosi number same hai toh frequency badhao
            } else {
                // Number badalte hi check karo kya pichla record break hua?
                if (currentCount > maxCount) {
                    maxCount = currentCount;
                    maxElement = arr[i - 1];
                }
                currentCount = 1; // Naye element ke liye tracking counter reset
            }
        }

        //Edge Case Boundary Fix: Aakhiri unique group ke counters check karein
        if (currentCount > maxCount) {
            maxCount = currentCount;
            maxElement = arr[count - 1];
        }

        //Step 3: Production Standard Result Display
        System.out.println("\n--- Maximum Frequency Element Result ---");
        System.out.println("Element with maximum frequency: " + maxElement);
        System.out.println("Total Occurrences (Frequency): " + maxCount);

        sc.close();
    }
}