//Recursive Sum of Digits:

import java.util.Scanner;
public class Q27
{
    //Funtion to get sum of digits
    public static void digitsum(int n, int sum){
        if(n==0) //Base condition
        {
            System.out.print("Sum of digits of given number is: ");
            System.out.print(sum);
            return;
        }
        int lst = n%10;
        sum += lst;
        digitsum(n/10,sum);
    }

    //Main
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to get Sum of digits: ");
        int num = sc.nextInt(); //Getting Number from user.
        digitsum(num,0);
        sc.close();
    }
}