import java.util.Scanner;

public class ForLoops
{   public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int user;

    System.out.print("Enter a number: ");
    user = scan.nextInt();

    //START OF FOR LOOP CONDITIONS:

    int total = 0;

    for(int counter = 1;  counter <= user; counter++)
    {
        if (counter % 2 == 0)
        {
            total += counter;
        }
    }
        System.out.println("The sum of all even numbers between " + "1 " + "and " + user + " is: " + total);


}
}
