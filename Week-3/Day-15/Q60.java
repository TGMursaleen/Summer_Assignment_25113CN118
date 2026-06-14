//Program to Move zeroes to end
import java.util.Scanner;
public class Q60 {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[100];
        int count = 0;
        System.out.println("Enter Array Element: (TO STOP PRESS ANY ALPHABET)");
        while(sc.hasNextInt() && count<100){
            arr[count] = sc.nextInt();
            count++;
        }

        //Checking Empty Array
        if(count==0){
            System.out.println("Empty Array!");
            sc.close();
            return;
        }
        

        //Creating an varible to arrange list element
        int non_zero = 0;
        for(int i=0; i<count; i++){
            if(arr[i] != 0){
                arr[non_zero] = arr[i];
                non_zero++;
            }
        }


        //Shifting Zeroes to left
        for(int i = non_zero; i<count; i++){
            arr[i] = 0;
        }

        //Printing final Array
        for(int i=0; i<count; i++){
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}