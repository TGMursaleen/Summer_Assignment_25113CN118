//Insertion Sort

import java.util.Scanner;

public class Q71 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[100];
        int count = 0;

        System.out.println("Enter Array Elements: (TO STOP PRESS ANY ALPHABET)");
        while (sc.hasNextInt() && count < 100) {
            arr[count++] = sc.nextInt();
        }

        sc.next(); // Stuck alphabet ko clear karne ke liye single line enough hai

        if (count == 0) {
            System.out.println("Array is empty! Nothing to sort.");
            sc.close();
            return;
        }

        // Insertion Sort Logic
        for (int i = 1; i < count; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }

        System.out.println("\nSorted Array (Insertion Sort): ");
        for (int i = 0; i < count; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        sc.close();
    }
}