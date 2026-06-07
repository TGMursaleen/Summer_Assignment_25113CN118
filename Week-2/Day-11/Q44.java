//Function to find Factorial
//Approach -> .In this we made a for loop starting from 1 and terminates at given number n
//            .we first made a fact named variable which initially contains 1
//            .We used 1 in fact variable because fact will be multiply with every integer from 1 to n
//             and if fact is 0 then overall output will become 0.
import java.util.Scanner;
public class Q44 {
    public static void factorial(int n){
        if(n>20){
            System.out.println("Don't give number greater than 20!!!");
            return;
        }
        else if(n<0){
            System.out.println("You entered a negative number!!!");
            return;
        }
        long fact=1;
        for(int i=1; i<=n; i++){
            fact*=i;
        }
        System.out.println(fact);
    }
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to find Factorial: (don't give number greater than 20!) ");
        int n = sc.nextInt();
        factorial(n);
        sc.close();
    }
}