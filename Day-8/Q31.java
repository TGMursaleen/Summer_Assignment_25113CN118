//Character Triangle
public class Q31 {
    public static void main(String[] arg){
        for(int i=65; i<=69; i++)
        {
            for(int j=65; j<=i; j++)
            {
                System.out.print((char)j);
            }
            System.out.println();
        }
    }
}
