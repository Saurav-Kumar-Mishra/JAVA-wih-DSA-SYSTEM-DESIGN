public class stringNumberPalindrome {
    public static void main (String []args)
    {
        String s="2552";
        String t="";
        for(int i=s.length()-1;i>=0;i--)
        {
             t+=s.charAt(i);
             
        }
        if(s.equals(t))
        {
            System.out.println("Given string is palindrome");
        }
        else
        System.out.println("Given string is not palindrome");
    }
}
