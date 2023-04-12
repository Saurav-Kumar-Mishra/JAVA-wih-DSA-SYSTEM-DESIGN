
import java.util.Scanner;
public class dateAndTime {
    public static void main(String[] args)
    {
        String a[]=new String[] {"SUNDAY","MONDAY","TUESDAY","WEDNESDAY","THURSDAY","FRIDAY","SATURDAY"};
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the date: ");
        int month=scan.nextInt();
        int day=scan.nextInt();
        int year=scan.nextInt();
        scan.close();
        int totalOddDays=0;
        if(year<2000||year>3000||day>30||month>12)
        System.exit(0);
        totalOddDays=(((((year-1)%400)+((year-1)%400)/4)-((year-1)%400)/100)%7);  
        int ar[]=new int[] {3,0,6,1,4,6,2,5,0,3,5,1};
        if((year)%4==0)
        totalOddDays+=ar[month-2]+1;
        else
        totalOddDays+=ar[month-2];   
        System.out.println(a[(totalOddDays+day)%7]);
    }
}
