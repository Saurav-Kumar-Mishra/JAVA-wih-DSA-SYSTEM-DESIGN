import java.util.Scanner;
public class C_pattern {
    public static void main (String []args)
    {    Scanner scan=new Scanner(System.in);
        System.out.println("enter the number of rows");
        int n=scan.nextInt();
        for(int i=0;i<=n;i++)
        {
            for (int j=0;j<=n;j++)
            {
            if ((i==0 && j>0 && j<n-1)||(i>0 && i<n && j==0)||(i==n && j>0 && j<n-1))
                System.out.print("*");
                else
                System.out.print(" ");
            }
            System.out.println();
        }
        scan.close();
    }
}