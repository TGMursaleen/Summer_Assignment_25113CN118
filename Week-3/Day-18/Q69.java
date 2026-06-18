// Q69: Program to Bubble sort
import java.util.Scanner;

public class Q69 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[100];
        int count = 0;

        // ---- STEP 1: DYNAMIC INPUT LOOP ----
        System.out.println("Enter Array Elements: (TO STOP PRESS ANY ALPHABET)");
        while (sc.hasNextInt() && count < 100) {
            arr[count++] = sc.nextInt();
        }
        sc.next();

        // ---- STEP 2: GUARD CLAUSE ----
        if (count == 0) {
            System.out.println("Array is empty! Nothing to sort.");
            sc.close();
            return;
        }

        // ---- STEP 3: BUBBLE SORT LOGIC ----
        // Hamara loop sirf 'count' tak chalega (bache hue empty 0 blocks ko touch nahi karega)
        for (int i = 0; i < count - 1; i++) {
            boolean swapped = false; // Optimization tracking loop ko beech mein rokne ke liye
            
            for (int j = 0; j < count - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap elements
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            
            // Agar kisi pass mein ek bhi swap nahi hua, matlab array pehle hi sort ho chuki hai!
            if (!swapped) {
                break;
            }
        }

        // ---- STEP 4: PRINT SORTED ARRAY ----
        System.out.println("\nSorted Array (Bubble Sort): ");
        for (int i = 0; i < count; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        sc.close();
    }
}