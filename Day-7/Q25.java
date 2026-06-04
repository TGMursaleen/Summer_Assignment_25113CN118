//Recursive Factorial Program:

import java.util.Scanner;
public class Q25 
{
    //Function to Print Recursive Factorial
    public static void factorial(int n,int i,int fact)
    {
        if(n==i)
        {
            System.out.println(fact);
            return;
        }
        fact*=n;
        factorial(n-1,i,fact);
    }

    //Main
    public static void main(String[] arg)
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter number to get Factorial: ");
        int a = sc.nextInt(); //Taking a from user to get factorial of a.
        System.out.print("Factorial of "+a+" is: ");
        factorial(a,1,1); //Calling Function it gives factorial of a.
        sc.close();
    }
}