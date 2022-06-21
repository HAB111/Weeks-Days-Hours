import java.util.Scanner;


public class Arrays3 {
    public static void main(String[] args) {
        double avg = 0;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter integer n, greater than 0: ");
        int user = scan.nextInt();

        int[] arr = new int[user];

        System.out.print("Enter " + user + " integers: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        // MAX Function
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }

        }
        System.out.println("Maximum Value: " + max);

        // MIN Function
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }

        }
        System.out.println("Minimum Value: " + min);

        //AVERAGE Function

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            avg = sum / user;
            // int ega = 0;
            // arr[i] > avg
            //System.out.println("Elements greater than the Average: " + ega);

        }
        System.out.println("Average: " + avg);

        //NUMBERS GREATER THAN AVERAGE
        int ega = 0;
        System.out.print("Elements greater than the Average: ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > avg) {
                ega = arr[i];
                System.out.println(ega + " ");
            }
        }
        // Elements greater than the last number (or index)

            int greater = 0;
            System.out.println("Elements greater than " + arr[user-1] + " :");

            for (int i = 0; i < arr.length; i++)
            {
                if (arr[user-1] < arr[i])
            {
                greater = arr[i];
                System.out.println(greater + " ");
            }
            }
            //REVERSE ORDER
            int rev = 0;
        System.out.print("Reverse Order: ");
            for (int i = arr.length-1; i >= 0 ; i--)
            {
                rev = arr[i];
                System.out.print(rev + " ");
            }
            }

        }




