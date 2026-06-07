//Funtion to find maximum
import java.util.Scanner;
public class Q42 {
    public static void max(){
        int[] a= new int[100];
        int count=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers to compare and to stop just press any letter: ");
        while(sc.hasNextInt() && count<100){
            a[count] = sc.nextInt();
            count++;    
        }
        if(count==0){
            System.out.println("No number is input!!!");
            sc.close();
            return;
        }
        int max = a[0];
        for(int i=1; i<=count; i++){
            if(max<=a[i]){
                max = a[i];
            }
        }
        System.out.print("Maximum of given numbers: ");
        System.out.println(max);
        sc.close();
    }
    public static void main(String[] arg){
        max();
    }
}