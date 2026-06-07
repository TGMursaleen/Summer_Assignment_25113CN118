//Armstrong Number Check
import java.util.Scanner;
public class Q46 {
    public static void isArmstrong(int n){
        if(n<0){
            System.out.println("NOT Armstrong");
            return;
        }
        int num = n;
        int len=0;
        while(num!=0){
            len++;
            num/=10;
        }
        if(n==0){
            len = 1;
        }
        num=n;
        int lst,sum = 0;
        while(num!=0){
            lst = num%10;
            sum = sum + (int)Math.round(Math.pow(lst, len));
            num/=10;
        }
        if(n==sum){
            System.out.println("Armstrong Number");
        }
        else{
            System.out.println("NOT Armstrong");
        }
    }
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to check for Armstrong: ");
        int n = sc.nextInt();
        isArmstrong(n);
        sc.close();
    }
}