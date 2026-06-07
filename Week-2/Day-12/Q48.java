//Function for Perfect Number
import java.util.Scanner;
public class Q48 {
    public static void isPerfect(int n){
        if(n<=0){
            System.out.println("NOT a Perfect Number");
            return;
        }
        int sum = 0;
        int num = (n/2) + 1;
        int fact;
        for(int i=1; i<num; i++){
            fact = n%i;
            if(fact==0){
                sum+=i;
            }
        }
        if(sum==n){
            System.out.println("Perfect Number");
        }
        else{
            System.out.println("NOT a Perfect Number");
        }
    }
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to check if it is Perfect or not: ");
        int n = sc.nextInt();
        isPerfect(n);
        sc.close();
    }
}
