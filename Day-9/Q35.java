//Repeated character
public class Q35 {
    public static void main(String[] arg){
        int n= 65;
        for(int i=1; i<=5; i++){
            for(int j=1; j<=i; j++){
                System.out.print((char)n);
            }
            n++;
            System.out.println();
        }
    }
}
