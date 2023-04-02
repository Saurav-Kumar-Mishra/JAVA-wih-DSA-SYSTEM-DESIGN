public class printDuplicate {
    
    static public void printDuplicates(String s)
      {   
          
          for (int i=0;i<s.length();i++)
            { 
            for (int j=i+1;j<s.length();j++)
               {
                   if(s.charAt(i)==s.charAt(j)&&s.charAt(i)!=' ')
                 {   
                    System.out.print(s.charAt(i));
                    break;
                 }
               }
            }
      }
       public static void main(String[] args) {
           String s="Welcome to java programming";
           printDuplicates(s);
            }
        }