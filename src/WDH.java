import java.util.Scanner;

public class WDH
{
        public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        int weeks;

        System.out.print("Enter number of weeks: ");
        weeks = scan.nextInt();

            int days    = weeks*7;
            System.out.println(days + " " + "Days");
            int hours   = days*24;
            System.out.println(hours + " " + "Hours");
            int mins    = hours*60;
            System.out.println(mins + " " + "Mins");
            int seconds = mins*60;
            System.out.println(seconds + " " + "Seconds");
    }
}
