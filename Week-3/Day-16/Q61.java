import java.util.Scanner;

public class Q61{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[100]; // Input buffer array
        int count = 0;

        System.out.println("Enter elements (1 to N, press any alphabet to stop): ");
        while (sc.hasNextInt()) {
            arr[count++] = sc.nextInt();
        }
        sc.next(); // Scanner pipeline buffer clear logic

        // Guard Clause: Agar user ne bina koi element dale stop kar diya
        if (count == 0) {
            System.out.println("Array is empty!");
            sc.close();
            return;
        }

        // 1. Array ka MAX element dhoondhna (Wahi hamara N banega)
        int n = arr[0];
        for (int i = 1; i < count; i++) {
            if (arr[i] > n) {
                n = arr[i];
            }
        }

        // 2. Visited tracking array banayi (Size = Max element + 1)
        boolean[] visited = new boolean[n + 1];
        for (int i = 0; i < count; i++) {
            if (arr[i] > 0) { // Sirf positive valid numbers ko track karne ke liye
                visited[arr[i]] = true;
            }
        }

        // 3. 1 se lekar N (Max) tak check karna ki kaun-kaun false reh gaya
        System.out.print("Missing numbers are: ");
        boolean foundMissing = false;
        for (int i = 1; i <= n; i++) {
            if (!visited[i]) { // Agar index false reh gaya, matlab user ne nahi dala
                System.out.print(i + " ");
                foundMissing = true;
            }
        }

        // Agar user ne saare numbers daale hon aur kuch bhi miss na kiya ho
        if (!foundMissing) {
            System.out.print("None! All elements from 1 to " + n + " are present.");
        }
        System.out.println();
        sc.close();
    }
}