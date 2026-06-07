//Writing Function to find sum of two number
//Approach -> making a function return the sum of two numbers
//by using '+' to get addition of two numbers

//Main Code:-

import java.util.Scanner;
public class Q41 {
    public static int sum(int a, int b){
        return (a+b);        
    }
    public static void main(String[] arg){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a and b to get sum of a and b: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println(sum(a,b));
        sc.close();
    }
}