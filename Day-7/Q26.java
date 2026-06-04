//Program to print Fibonacci series upto n terms
import java.util.Scanner;
public class Q26
{
    //Fibonacci Function
    public static void fibonacci(int a, int b, int n){
        if(n==0){
            return;
        }
        int c = a+b;
        System.out.print(c+" ");
        fibonacci(b,c,n-1); //Recursion
    }

    //Main
    public static void main(String[] arg){
        int a=0,b=1;
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the no. of terms to get from Fibonacci Series: ");
        int n= sc.nextInt(); //taking no. of element of fibonacci.

        //Printing Fibonacci Series 
        System.out.print("Fibonacci Series upto "+n+"th terms: ");
        System.out.print(a+" "); 
        System.out.print(b+" ");
        fibonacci(a,b,n-2);
        sc.close();
    }    
}
