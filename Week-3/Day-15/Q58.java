//Rotate Array Left

//We will create a new array of those elements which we have to rotate
import java.util.Scanner;
public class Q58 {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        int count =0;
        int[] arr = new int[100];

        //Getting Array Elements
        System.out.println("Enter Array Element: (TO STOP PRESS ANY ALPHABET)");
        while(sc.hasNextInt() && count<100){
            arr[count] = sc.nextInt();
            count++;
        }
        sc.next();
        System.out.print("Enter no of element to rotate left: ");
        int num = sc.nextInt();  //Getting number of element from user to rotate left

        //Creating a new array
        int[] arr_1 = new int[num];

        //Adding Elements and printing
        for(int i=0; i<num; i++){
            arr_1[i] = arr[i];
        }
        for(int i=num; i<count; i++){
            System.out.print(arr[i] + " ");
        }
        for(int i=0; i<num; i++){
            System.out.print(arr_1[i] + " ");
        }
        sc.close();
    }
}