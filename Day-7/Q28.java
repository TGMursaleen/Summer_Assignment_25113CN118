//Program to print Reverse of the Number:

import java.util.Scanner;
public class Q28 {
    
    //Function to reverse and Print the Number 
    public static void revnum(int n, int rev){ //Here n is Original Number and rev is Reversed number
        if(n==0){
            System.out.print("Reversed number: ");
            System.out.print(rev);
            return;
        }
        int lst = n%10;
        rev = rev*10 + lst;
        revnum(n/10,rev);
    }

    //Main
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to reverse: ");
        int num = sc.nextInt(); //num is number to be reversed
        revnum(num,0);
        sc.close();
    }
}
