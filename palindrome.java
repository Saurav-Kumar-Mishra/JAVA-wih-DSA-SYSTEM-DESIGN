
import java.util.*;
import java.lang.*;
public class palindrome {
    static public void main(String []arg)
    {   int rev=0;
        
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the number ");
        int n= scan.nextInt();
        int k=n;
        while(n!=0)
        {  
            int rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        if(rev==k)
        System.out.println("the given number is palindrome");
        else
        System.out.println("the given number is not palindrome");
    }
    
}
