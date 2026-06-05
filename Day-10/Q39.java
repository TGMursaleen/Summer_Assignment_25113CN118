//Number Pyramid
public class Q39 {
    public static void main(String[] arg){
        for(int i=1; i<=5; i++){ //outer loop used for height of pyramid

            //Inner Lopps
            for(int j=5-i; j>=1; j--){ //loop used to print spaces
                System.out.print(" ");
            }

            //These two loops are used to print numbers
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            for(int j=i-1; j>=1; j--){
                System.out.print(j);
            }

            //Loop used again to print rest spaces
            for(int j=5-i; j>=1; j--){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}