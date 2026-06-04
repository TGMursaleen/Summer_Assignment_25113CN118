//Repeated Number Pattern
public class Q32 {
    public static void main(String[] arg){
        int n= 1;
        for(int i=1; i<=5; i++)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print(n);
            }
            n++;
            System.out.println();
        }
    }
}
