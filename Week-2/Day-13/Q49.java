//Input and Display Array
import java.util.Scanner;
public class Q49 {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[100];
        int count = 0;
        System.out.println("Enter Elements of Array: (If you complete entering Elements just press any alphabet)");
        while(sc.hasNextInt() && count<100){
            arr[count] = sc.nextInt();
            count++;
        }
        for(int i=0; i<count; i++){
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}
