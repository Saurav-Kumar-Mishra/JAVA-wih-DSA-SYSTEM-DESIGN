public class countVowelConsonats {
    public static void main(String[] args) {
        int v=0;
        int c=0;
        int o=0;
        String s="Welcome$to@java*programming";
       
    for(int i=0;i<s.length();i++)
    {
if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
   {     v++;  }
        else if (((int)s.charAt(i)<65 || (int)s.charAt(i)>90)&&(int)s.charAt(i)<97||(int)s.charAt(i)>122)
        o++;
        else
        c++;
    }
      System.out.println("Vowel: "+v);
      System.out.println("consonants: "+c);
      System.out.println("Special Characters: "+o);
          }
      }


