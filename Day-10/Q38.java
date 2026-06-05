//Reverse Pyramid
public class Q38 {
    public static void main(String[] arg){
        int x=4;
        for(int i=5; i>=1; i--){
            for(int j=5-i; j>=1; j--){
                System.out.print(" ");
            }
            for(int j=1; j<=(i+x); j++){
                System.out.print("*");
            }
            for(int j=5-i; j>=1; j--){
                System.out.print(" ");
            }
            System.out.println();
            x--;
        }
        
    }
}