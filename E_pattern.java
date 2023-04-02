import java.util.Scanner;
public class string {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the number");
        int a=scan.nextInt();
        //  System.out.println(a);
        scan.nextLine();
          System.out.println("enter any string");
        String str= scan.nextLine();
         System.out.println(str + " " + a);
        
    }
}