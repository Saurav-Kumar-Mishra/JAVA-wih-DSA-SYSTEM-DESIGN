import java.util.*;
import java.io.*;
import java.lang.System;
class sum{
    
    // public static int sum1(int n,int b)  i was trying to do it with the help of recursion
    // {   static int s=0;
    //     if(n<0)
    //     return 0;
    //     s=s+Math.pow(2,n)*b;
    //     sum1(n--,b);
    //     return s;
    // }
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        if(t<0||t>500)
        {
            System.out.println("you have enterd wrong no of queries exiting.....");
            System.exit(0);
        }
        double s=0;
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            if(a<0||b>50||n<1||n>15)
            {
                System.out.println("you have enterd wrong values of elements  exiting.....");
                System.exit(0);
            }
            for(int j=1;j<=n;j++)
            {   s=0;
                for(int k=0;k<j;k++)
                {
          s=s+Math.pow((double)2,(double)k)*(double)b;
              
            }
            System.out.print((int)s+a+" ");
        }
        System.out.println();
        }
        in.close();
    }
}
