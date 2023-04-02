
import java.util.Arrays;
public class Pangram {
    public static void main(String []args)
    {   int f=1;
        String s="The quick Brown Fox Jumps Over Lazy Dog";
        s=s.replace(" ", "");
        s=s.toUpperCase();
        char a[]=s.toCharArray();
        Arrays.sort(a);
        int b[]=new int[26];
        for(int i=0;i<a.length;i++)
        {
            b[a[i]-65]++;
        }
        for(int i=0;i<b.length;i++)
        {
            if(b[i]==0)
            {   
                System.out.println("It is not a pangram");
                f=0;
                break;
            }
            
        }
        if(f!=0)
        System.out.println("It is a pangram");
    }
}
