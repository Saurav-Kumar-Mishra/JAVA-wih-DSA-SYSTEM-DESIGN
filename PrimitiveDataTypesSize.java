import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class PrimitiveDataTypesSize {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String str;
   
        int t=scan.nextInt();   
        for(int i=0;i<t;i++)
        {
            str=scan.next();
            BigInteger n=new BigInteger(str);
            if(n.compareTo(BigInteger.valueOf(Byte.MIN_VALUE))>=0 && n.compareTo(BigInteger.valueOf(Byte.MAX_VALUE))<=0)
            {
                System.out.println(n +" can be fitted in:");
                System.out.println("* byte");
                System.out.println("* short");
                System.out.println("* int");
                System.out.println("* long");
            }
            else  if(n.compareTo(BigInteger.valueOf(Short.MIN_VALUE))>=0 && n.compareTo(BigInteger.valueOf(Short.MAX_VALUE))<=0)
            {
                System.out.println(n +" can be fitted in:"); 
                System.out.println("* short");
                System.out.println("* int");
                System.out.println("* long");
            }
            else  if(n.compareTo(BigInteger.valueOf(Integer.MIN_VALUE))>=0 && n.compareTo(BigInteger.valueOf(Integer.MAX_VALUE))<=0)
            {
                System.out.println(n +" can be fitted in:");            
                System.out.println("* int");
                System.out.println("* long");
            }
            else  if(n.compareTo(BigInteger.valueOf(Long.MIN_VALUE))>=0 && n.compareTo(BigInteger.valueOf(Long.MAX_VALUE))<=0)
            {
                System.out.println(n.toString() +" can be fitted in:");            
                System.out.println("* long");
            }
            else  if(n.compareTo(BigInteger.valueOf(Long.MIN_VALUE))<=0 && n.compareTo(BigInteger.valueOf(Long.MAX_VALUE))>=0)
            {
                System.out.println(n+" can't be fitted anywhere.");
            }
            else 
            {
                System.out.println(n+" can't be fitted anywhere.");
            }
        }
    }
}
