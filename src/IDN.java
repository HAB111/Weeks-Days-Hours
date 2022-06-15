import java.util.Scanner;

public class IDN
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        double x;
        double y;
        double z;

        System.out.print("Please Enter X: ");
       x = scan.nextDouble();

        System.out.print("Please Enter Y: ");
        y = scan.nextDouble();

        System.out.print("Please Enter Z: ");
        z = scan.nextDouble();

        if (x<y & y<z)
        {
            System.out.println("Increasing");
        }
        else if (x>y & y>z)
        {
            System.out.println("Decreasing");
        }
        else
        {
            System.out.println("Neither");
        }

        System.out.println("Thank you for using our program!");
    }

}
