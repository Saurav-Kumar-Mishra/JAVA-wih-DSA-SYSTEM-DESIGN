
    import java.util.Scanner;
    public class B_pattern {
        public static void main (String []args)
        {    Scanner scan=new Scanner(System.in);
            System.out.println("enter the number of rows");
            int n=scan.nextInt();
            for(int i=0;i<=n;i++)
            {
                for (int j=0;j<=n;j++)
                {
                    if ((i==0 && j>0 && j<n)||(i==n && j>0 && j<n)||( j==0)||(i==n/2 && j!=n)||(i>0 && i<n && i!=n/2 && j==n))
                    System.out.print("*");
                    else
                    System.out.print(" ");
                }
                System.out.println();
            }
            scan.close();
        }
    }
    
