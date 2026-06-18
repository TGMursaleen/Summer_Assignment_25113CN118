//Binary Search

import java.util.Scanner;

public class Q72 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[100];
        int count = 0;

        System.out.println("Enter Array Elements: (TO STOP PRESS ANY ALPHABET)");
        while (sc.hasNextInt() && count < 100) {
            arr[count++] = sc.nextInt();
        }

        sc.next(); 

        if (count == 0) {
            System.out.println("Array is empty! Cannot perform Binary Search.");
            sc.close();
            return;
        }

        for (int i = 0; i < count - 1; i++) {
            for (int j = 0; j < count - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println("Enter the element you want to search: ");
        int target = sc.nextInt();

        int low = 0;
        int high = count - 1;
        int resultIndex = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                resultIndex = mid;
                break;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        if (resultIndex != -1) {
            System.out.println("Element " + target + " found at sorted array index: " + resultIndex);
        } else {
            System.out.println("Element " + target + " not found in the array.");
        }

        sc.close();
    }
}