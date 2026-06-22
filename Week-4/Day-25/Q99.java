import java.util.Scanner;

public class Q99 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of names: ");
        int n = sc.nextInt();
        sc.nextLine(); // Scanner buffer clear karne ke liye

        String[] names = new String[n];
        System.out.println("Enter " + n + " names: ");
        for (int i = 0; i < n; i++) {
            names[i] = sc.nextLine();
        }

        // Optimized Merge Sort algorithm call karna
        mergeSort(names, 0, n - 1);

        System.out.println("\nNames in alphabetical order: ");
        for (int i = 0; i < n; i++) {
            System.out.println(names[i]);
        }

        sc.close();
    }

    // Merge Sort - Array ko do halves mein todne ke liye
    public static void mergeSort(String[] arr, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;

            mergeSort(arr, left, mid);      // Left half sort karna
            mergeSort(arr, mid + 1, right); // Right half sort karna

            merge(arr, left, mid, right);   // Dono sorted halves ko merge karna
        }
    }

    // Two Sorted subarrays ko combine karne ka core logic
    public static void merge(String[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        String[] leftArr = new String[n1];
        String[] rightArr = new String[n2];

        for (int i = 0; i < n1; i++) {
            leftArr[i] = arr[left + i];
        }
        for (int j = 0; j < n2; j++) {
            rightArr[j] = arr[mid + 1 + j];
        }

        int i = 0, j = 0, k = left;

        // compareTo() use karke alphabetical check karna
        while (i < n1 && j < n2) {
            if (leftArr[i].compareTo(rightArr[j]) <= 0) {
                arr[k] = leftArr[i];
                i++;
            } else {
                arr[k] = rightArr[j];
                j++;
            }
            k++;
        }

        // Bache hue elements copy karna
        while (i < n1) {
            arr[k] = leftArr[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = rightArr[j];
            j++;
            k++;
        }
    }
}