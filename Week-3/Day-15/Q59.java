import java.util.Scanner;
public class Q59 {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[100];
        int count =0;
        System.out.println("Enter Array Elements: (TO STOP PRESS ANY ALPHABET)");
        while(sc.hasNextInt() && count<100){
            arr[count] = sc.nextInt();
            count++;
        }
        sc.next();
        System.out.print("Enter no. of element to rotate right: ");
        int num = sc.nextInt(); //Getting no of element to rotate right

        //Printing Rotated Array
        System.out.println("Rotated Array: ");
        for(int i=count-num;i<count; i++){
            System.out.print(arr[i] + " ");
        }
        for(int i=0; i<count-num; i++){
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}