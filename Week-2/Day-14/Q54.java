//Frequency of an element
import java.util.Scanner;
public class Q54 {
    public static void main(){
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int[] arr = new int[100];
        System.out.println("Enter Elements: (TO STOP PRESS ANY ALPHABET)");
        while(sc.hasNextInt() && count<100){
            arr[count] = sc.nextInt();
            count++;
        }
        if(count==0){
            System.out.println("Array is Empty!");
            sc.close();
            return;
        }
        if(sc.hasNext()){
            sc.next();
        }
        System.out.println("Enter the element to check frequency: ");
        int num = sc.nextInt();
        int freq = 0;
        for(int i=0; i<count; i++){
            if(num==arr[i]){
                freq++;
            }
        }
        System.out.println("Frequency of the Element is: " + freq);
        sc.close();
    }
}