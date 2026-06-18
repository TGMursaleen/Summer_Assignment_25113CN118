//Selection Sort

import java.util.Scanner;

public class Q70 {
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
            System.out.println("Array is empty! Nothing to sort.");
            sc.close();
            return;
        }

        // Selection Sort Logic
        for (int i = 0; i < count - 1; i++) {
            int minIndex = i; 
            
            for (int j = i + 1; j < count; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j; 
                }
            }
            
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }

        System.out.println("\nSorted Array (Selection Sort): ");
        for (int i = 0; i < count; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        sc.close();
    }
}