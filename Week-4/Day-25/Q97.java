import java.util.Scanner;

public class Q97 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // First Sorted Array Input
        System.out.println("Enter size of first sorted array: ");
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        System.out.println("Enter elements for first sorted array: ");
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }

        // Second Sorted Array Input
        System.out.println("Enter size of second sorted array: ");
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        System.out.println("Enter elements for second sorted array: ");
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }

        // Result Array (Size will be sum of both array sizes)
        int[] result = new int[n1 + n2];

        int i = 0; // Pointer for arr1
        int j = 0; // Pointer for arr2
        int k = 0; // Pointer for result array

        // Dono arrays ko compare karke chote elements result mein dalna
        while (i < n1 && j < n2) {
            if (arr1[i] <= arr2[j]) {
                result[k] = arr1[i];
                i++;
            } else {
                result[k] = arr2[j];
                j++;
            }
            k++;
        }

        // Agar arr1 ke bache hue elements hain toh copy karein
        while (i < n1) {
            result[k] = arr1[i];
            i++;
            k++;
        }

        // Agar arr2 ke bache hue elements hain toh copy karein
        while (j < n2) {
            result[k] = arr2[j];
            j++;
            k++;
        }

        // Merged Sorted Array print karna
        System.out.println("\nMerged Sorted Array: ");
        for (int m = 0; m < result.length; m++) {
            System.out.print(result[m] + " ");
        }
        System.out.println();

        sc.close();
    }
}