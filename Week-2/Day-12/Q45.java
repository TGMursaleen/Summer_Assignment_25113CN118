//Function to check palindrom
//Approach -> We made a while loop to calculate reverse number and after this we check if it is equal to original number or not
import java.util.Scanner;
public class Q45 {
    public static void ispalindrom(int n){
        if(n<0){
            System.out.println("Number is NOT palindrom");
            return;
        }
        int num=n;
        int rev=0;
        int rem;
        
        //Reversing the number and storing it into rev
        while(num!=0){
            rem = num%10;
            rev = rev*10 + rem;
            num/=10;
        }

        //Checking Is rev equals to original number or not
        if(rev==n){
            System.out.println("Number is palindrom");
        }
        else{
            System.out.println("Number is NOT palindrom");
        }
    }
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number to check if it is palindrom or not: ");
        int n = sc.nextInt();
        ispalindrom(n);
        sc.close();
    }
}