//Function for fibonacci
import java.util.Scanner; 
public class Q47 {
    public static void fib(int n){
        if(n<=0){
            System.out.println("Please Enter a number greater than 0!");
            return;
        }
        else if(n==1){
            System.out.println(0);
            return;
        }
        int a=0;
        int b=1;
        int c;
        System.out.print(a+" ");
        System.out.print(b+" ");
        for(int i=0; i<(n-2); i++){
            c=a+b;
            System.out.print(c+" ");
            a=b;
            b=c;
        }
    }
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms you want to print of fibonacci: ");
        int n = sc.nextInt();
        fib(n);
        sc.close();
    }
}
