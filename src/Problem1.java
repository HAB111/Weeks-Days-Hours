import java.util.Scanner;

public class Problem1
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a;
        int b;
        int c;
        int d;

        System.out.print("Enter a: ");
        a = scan.nextInt();
        System.out.print("Enter b: ");
        b = scan.nextInt();
        System.out.print("Enter c: ");
        c = scan.nextInt();
        System.out.print("Enter d: ");
        d = scan.nextInt();

        int sum1 = sum(a,b,c,d);
        System.out.println("ADDITION:\n" + a + " + " + b + " + " +  c + " + " + d + " = " + sum1);

        int sum2 = multiply(a,b,d);
        System.out.println("MULTIPLICATION:\n" + a + " * " + b + " * " + d +  " = " + sum2);

        double sum3 = divide(b,d);
        System.out.println("DIVISION:\n" + b + " / " + d + " = " + sum3);

        int sum4 = subtract(c,b);
        System.out.println("SUBTRACT:\n" + c + " - " + b + " = " + sum4);
    }

        //ADDITION METHOD
        public static int sum(int a, int b, int c, int d)
        {
        int result = (a+b+c+d);
        return result;
        }
        //MULTIPLICATION METHOD
        public static int multiply(int a, int b, int d)
        {
        int result = (a*b*d);
        return result;
        }
        //DIVISION METHOD
        public static double divide(int b, int d)
        {
        double result = (double) (b / d);
        return result;
        }
        //SUBTRACTION METHOD
        public static int subtract(int c, int b)
        {
        int result = (c - b);
        return result;
        }

}
