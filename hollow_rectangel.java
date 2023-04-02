import java.util.Scanner;
public class hollow_rectangel {
    public static void main (String []args)
    {    Scanner scan=new Scanner(System.in);
        System.out.println("enter the number of rows");
        int n=scan.nextInt();
        for(int i=1;i<=n;i++)
        {
            for (int j=1;j<=n;j++)
            {
                if (i==1||j==1||j==n||i==n)
                System.out.print("*");
                else
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
