import java.util.Scanner;
public class Loops {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        int n;

        System.out.print("Enter an integer greater than 1: ");
        n=scan.nextInt();                   // enter input

        int i;
        int s=0;

        for(i=1;i<=n;i++)
        {
            if(n%i==0)                   // extract factors
            {
                s=s+i;                   // compute sum of factors
            }
        }
        System.out.println("The sum of the factors of "+n+" is "+s); // display the sum
    }
}