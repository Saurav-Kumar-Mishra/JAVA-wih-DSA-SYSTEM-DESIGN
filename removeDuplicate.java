import java.util.Scanner;
class removeDuplicate {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
         System.out.println("Enter any duplicate string ");
         String s=scan.nextLine();
        // String s="Welcome to java programming";
        String t="";
         for (int i=0;i<s.length();i++)
          { int f=1;
              for(int j=0;j<t.length();j++)
              {   
                  if(s.charAt(i)==t.charAt(j)&&s.charAt(i)!=' ')
                  { f=0;
                    // System.out.print("repeating characters: "+s.charAt(i));
                  break; 
                }
              }
              if(f==1)
            {   
                t=t+s.charAt(i);
            }
           
          }

          System.out.println();  
        System.out.println(t);
          }
      }

