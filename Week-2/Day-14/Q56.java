//Finding duplicates in array
import java.util.Scanner;
public class Q56 {
    public static void main(String[] arg){
        int[] arr = new int[100];
        Scanner sc = new Scanner(System.in);
        int count = 0;
        System.out.println("Enter array Elements: (TO STOP PRESS ANY ALPHABET)");
        while(sc.hasNextInt() && count<100){
            arr[count] = sc.nextInt();
            count++;
        }
        if(count==0){
            System.out.println("Array is Empty!");
            sc.close();
            return;
        }
        int[] duplicate = new int[50];
        int index = 0;
        for(int i=0; i<count; i++){
            for(int j=i+1; j<count; j++){
                if(arr[i]==arr[j]){
                    boolean alreadyexisted = false;
                    for(int k=0; k<index; k++){
                        if(duplicate[k] == arr[i])
                        {
                            alreadyexisted = true;
                            break;
                        }    
                    }
                    if(!alreadyexisted)
                    {    
                        duplicate[index] = arr[i];
                        index++;
                    }
                    break;    
                }
            }
        }
        if(index==0){
            System.out.println("No Duplicates Found!");
            sc.close();
            return;
        }
        System.out.println("Duplicates in the Array is: ");
        for(int i=0; i<index; i++){
            System.out.print(duplicate[i] + " ");
        }
        sc.close();
    }
}