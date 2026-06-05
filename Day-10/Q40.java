//Character Pyramid
public class Q40 {
    public static void main(String[] arg){
        int A=64;
        for(int i=1; i<=5; i++){
            
            //This loop prints spaces before Character
            for(int j=5-i; j>=1; j--){
                System.out.print(" ");
            }

            //These below two loops will print characters
            for(int j=1; j<=i; j++){
                System.out.print((char)(A+j));
            }
            for(int j=i-1; j>=1; j--){
                System.out.print((char)(A+j));
            }

            //Loop to print rest of the spaces
            for(int j=5-i; j>=1; j--){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
