//Program to find count of even and odd
import java.util.Scanner;
public class Q52 {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[100];
        System.out.println("Enter Elements: (TO STOP PRESS ANY ALPHABET)");
        int count = 0;
        while(sc.hasNextInt() && count<100){
            arr[count] = sc.nextInt();
            count++;
        }
        if(count==0){
            System.out.println("Array is Empty!");
            sc.close();
            return;
        }
        int even = 0;
        int odd = 0;
        for(int i=0; i<count; i++){
            if(arr[i]%2==0){
                even++;
            }
            else{
                odd++;
            }
        }
        System.out.println("Even count: " + even);
        System.out.println("Odd count: " + odd);
        sc.close();
    }
}