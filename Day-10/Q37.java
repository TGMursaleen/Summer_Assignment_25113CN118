//Star Pyramid code
public class Q37 {
    public static void main(String[] arg){
        int x=0;
        for(int i=1; i<=5; i++){
            for(int j=5-i; j>=0; j--){ //This loop prints spaces before stars
                System.out.print(" ");
            }
            for(int k=1; k<=(i+x); k++){ //Here i+x gives no. stars to be print
                System.out.print("*");
            }
            for(int j=5-i; j>=0; j--){ //This loop also prints spaces but after stars
                System.out.print(" ");
            }
            System.out.println();
            x++;
        }
    }
}