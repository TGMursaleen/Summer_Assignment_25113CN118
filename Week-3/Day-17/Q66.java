// Q66: Union of Two Arrays using Simple Sorting & Filtering
import java.util.Scanner;
import java.util.Arrays;

public class Q66 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr1 = new int[100];
        int[] arr2 = new int[100];
        int count1 = 0, count2 = 0;

        // ---- STEP 1: INPUT FIRST ARRAY ----
        System.out.println("Enter Array 1 Elements: (TO STOP PRESS ANY ALPHABET)");
        while (sc.hasNextInt() && count1 < 100) {
            arr1[count1++] = sc.nextInt();
        }
        sc.next(); // Buffer clear [cite: 1825]

        // ---- STEP 2: INPUT SECOND ARRAY ----
        System.out.println("Enter Array 2 Elements: (TO STOP PRESS ANY ALPHABET)");
        while (sc.hasNextInt() && count2 < 100) {
            arr2[count2++] = sc.nextInt();
        }
        sc.next(); // Final Buffer clear

        // Guard Clause: Agar dono khali hain [cite: 1100]
        if (count1 == 0 && count2 == 0) {
            System.out.println("Both arrays are empty!");
            sc.close();
            return;
        }

        // ---- STEP 3: MERGE BOTH ARRAYS INTO A BIG ARRAY ----
        int[] tempUnion = new int[count1 + count2];
        int totalElements = 0;

        // Array 1 ke saare elements daalo
        for (int i = 0; i < count1; i++) {
            tempUnion[totalElements++] = arr1[i];
        }
        // Array 2 ke saare elements daalo
        for (int i = 0; i < count2; i++) {
            tempUnion[totalElements++] = arr2[i];
        }

        // ---- STEP 4: SORT THE MERGED ARRAY (As per your idea) ----
        Arrays.sort(tempUnion, 0, totalElements);

        // ---- STEP 5: UNIQUE PRINTING LOGIC ----
        System.out.println("\nUnion of the two arrays is: ");
        
        // Pehla element hamesha unique hota hai, use direct print karo
        System.out.print(tempUnion[0] + " ");

        // Baki elements tabhi print karo jab wo apne pichle waale se alag hon
        for (int i = 1; i < totalElements; i++) {
            if (tempUnion[i] != tempUnion[i - 1]) { // Duplicate filter logic 
                System.out.print(tempUnion[i] + " ");
            }
        }
        
        System.out.println();
        sc.close();
    }
}