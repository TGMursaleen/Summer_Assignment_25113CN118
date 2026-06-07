//Fuction to check prime number
//Approach -> .First we made a function named primecheck it takes only one integer and return nothing
//            .In the starting we let n is prime number by assigning isprime as 1
//            .Then we make some special cases like for negative numbers and for 1 also
//            .Then we check the number by taking modulo if modulo gives 0 then we change isprime into any integer except 1
//            .In the end if isprime eqauls to 1 then number is prime otherwise not prime.  
import java.util.Scanner;
public class Q43{
    public static void primecheck(int n){
        int isprime= 1;
        if(n<=0){
            System.out.println("You Entered zero or a negative number!!!");
            return;
        }
        if(n==1){
            System.out.println("NOT a prime number");
            return;
        }
        int num = (n/2) + 1;
        for(int i=2; i<num; i++){
            if(n%i==0){
                isprime= 0;
                break;
            }
        }
        if(isprime==1){
            System.out.println("Prime number");
        }
        else{
            System.out.println("NOT a prime number");
        }
    }
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to check if it is Prime or not: ");
        int n= sc.nextInt();
        primecheck(n);
        sc.close();
    }
}