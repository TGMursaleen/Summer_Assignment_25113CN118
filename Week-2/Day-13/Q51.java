//Program to find smallest and largest from array
import java.util.Scanner;
public class Q51 {
    public static void main(String[] arg){
        int[] arr = new int[100];
        Scanner sc = new Scanner(System.in);
        int count = 0;
        System.out.println("Enter elements: (TO STOP PRESS ANY ALPHABET)");
        while(sc.hasNextInt() && count<100){
            arr[count] = sc.nextInt();
            count++;
        }
        if(count==0){
            System.out.println("Array is Empty!");
            sc.close();
            return;
        }
        int max = arr[0];
        int min = arr[0];
        for(int i=0; i<count; i++){
            if(arr[i]>=max){
                max = arr[i];
            }
            if(arr[i]<=min){
                min = arr[i];
            }
        }
        System.out.println("Largest: " + max);
        System.out.println("Lowest: " + min);
        sc.close();
    }
}