//Program to Reverse Array
import java.util.Scanner;
public class Q57 {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of array: ");
        int len = sc.nextInt();
        int[] arr = new int[len];
        System.out.println("Enter Array Element: ");
        for(int i=0; i<len; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Reversed Array: ");
        for(int i=len-1; i>=0; i--){
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}