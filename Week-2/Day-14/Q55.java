//Program to find Second Largest Element
import java.util.Scanner;
import java.util.Arrays;
public class Q55 {
    public static void main(String[] arg){
        int count =0;
        int[] arr = new int[101];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Elements: (TO STOP PRERSS ANY ALPHABET)");
        while(sc.hasNextInt() && count<100){
            arr[count] = sc.nextInt();
            count++;
        }
        if(count==0){
            System.out.println("Array is Empty!");
            sc.close();
            return;
        }
        Arrays.sort(arr,0,count);
        boolean found = false;
        int largest = arr[count -1];
        for(int i=count -2; i>=0; i--){
            if(arr[i]<largest){
                System.out.println("Second Largest Element: " + arr[i]);
                found=true;
                break;
            }
        }
        if(!found){
            System.out.println("There is no Second Largest Element!");
        }
        sc.close();
    }    
}