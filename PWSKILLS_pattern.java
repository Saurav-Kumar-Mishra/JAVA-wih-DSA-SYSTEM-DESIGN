import java.util.Scanner;
public class PWSKILLS_pattern {
    public static void main(String []args)
    {
      Scanner scan=new Scanner(System.in);
      System.out.println("enter the no of row");
      int n=scan.nextInt();
      for(int i=0;i<=n;i++)
      {
          for (int j=0;j<=n;j++)
          {
              if(j==0||(i==0&&j<n)||(i==n/2&&j!=n)||(i>0 && i<n/2 && j==n))
              System.out.print("*");
              else
              System.out.print(" ");
          }
          System.out.print("   ");
          for (int j=0;j<=n;j++)
          {
              if(j==0||(i>=n/2+1 && i+j==n )|| (i>n/2+1 && i-j==1)||j==n-1)
              System.out.print("*");
              else
              System.out.print(" ");
          }
          System.out.print("      ");
          for (int j=0;j<=n;j++)
          {
              if((i==0 && j>0) || (i>0 && i<n/2 && j==0) || (i==n/2 && j>0 && j<n)|| (i>n/2&&i<n && j==n)||(i==n && j>=0 && j<n))
              System.out.print("*");
              else
              System.out.print(" ");
          }
          System.out.print("   ");
          for (int j=0;j<=n;j++)
          {
              if(j==0||(i>=0 &&i<=n/2 && i+j==n/2+1)||(i>=n/2 && i-j==2))
              System.out.print("*");
              else
              System.out.print(" ");
          }
          System.out.print(" ");
          for (int j=0;j<=n;j++)
          {
              if(i==0||i==n||j==(n/2))
              System.out.print("*");
              else
              System.out.print(" ");
          }
          System.out.print("  ");
          for (int j=0;j<=n;j++)
          {
              if(j==0||i==n)
              System.out.print("*");
              else
              System.out.print(" ");
          }
          System.out.print("  ");
          for (int j=0;j<=n;j++)
          {
              if(j==0||i==n)
              System.out.print("*");
              else
              System.out.print(" ");
          }
        
          System.out.print("  ");
          for (int j=0;j<=n;j++)
          {
              if((i==0 && j>0) || (i>0 && i<n/2 && j==0) || (i==n/2 && j>0 && j<n)|| (i>n/2&&i<n && j==n)||(i==n && j>=0 && j<n))
              System.out.print("*");
              else
              System.out.print(" ");
          }
          System.out.println();
      }
    }  
  }   
