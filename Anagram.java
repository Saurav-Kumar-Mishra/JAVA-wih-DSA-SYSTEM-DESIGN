import java.util.Arrays;

public class Anagram {
    public static void main(String []args)
    {
        String s1="School Master";
        String s2="The Classroom";
        s1=s1.replace(" ", "");
        s2=s2.replace(" ", "");
        s1=s1.toLowerCase();
        s2=s2.toLowerCase();
        char a[]=s1.toCharArray();
        char b[]=s2.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        if(Arrays.equals(a,b))
        {
            System.out.println("It's an Anagram");
        }
        else
            System.out.println("It's not an Anagram");
    }
}
