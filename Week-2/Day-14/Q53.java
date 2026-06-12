//Linear Search

//In this we compare required number with every number of array!
import java.util.Scanner;
public class Q53 {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int[] arr = new int[100];

        //Building Array
        System.out.println("Enter Element: (TO STOP PRESS ANY ALPHABET)");
        while(sc.hasNextInt() && count<100){
            arr[count] = sc.nextInt();
            count++;
        }

        //Loop used to check if Array is Empty
        if(count == 0){
            System.out.println("Array is Empty! Can't perform Linear Search");
            sc.close();
            return;
        }


        if(sc.hasNext()){
            sc.next();
        }
        System.out.print("Enter element to find in array: ");
        int num = sc.nextInt();
        int[] target = new int[100];
        boolean found = false;
        int j=0;

        //Searching in Array
        for(int i=0; i<count; i++){
            if(num==arr[i]){
                found = true;
                target[j] = i;
                j++;
            }
        }
        if(j==1){
            System.out.println("Element is found at index: " + target[0]);
        }
        else if(j>1){
            System.out.println("Element is found at indices: ");
            for(int k=0; k<j; k++){
                System.out.print(target[k] + " ");
            }
        }

        //condition if Element is not found
        if(!found){
            System.out.println("Element is not found in Array!");
        }
        sc.close();
    }
}