//Finding sum and average of Array
import java.util.Scanner;
import java.util.Arrays;
public class Q50{public static void main(String[] arg)
    {
        int count = 0;
        int[] arr = new int[100];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Elements once complete entering press any Alphabet: ");
        while(sc.hasNextInt() && count<100){
            arr[count] = sc.nextInt();
            count++;
        }

        //Direct Array function to calculate Sum
        int sum = Arrays.stream(arr).limit(count).sum();

        
        double avg = (count>0) ? (double) sum/count : 0;
        
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + avg);
        sc.close();
    }
}