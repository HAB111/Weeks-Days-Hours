import java.util.Scanner;
import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class ArraysExtraHW
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int user;

        do
        {
            System.out.print("Enter number greater than 10: ");
            user = scan.nextInt();
        }
        while (user>0 && user<11);



        int[] arr = new int[user];
        System.out.println("Before Swap: ");

        //Random number initializer:
        int min = 2;
        int max = 75;
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = ThreadLocalRandom.current().nextInt(min, max);
        }
        System.out.println(Arrays.toString(arr));


        // SUM of INDEXES 2,5,7 and 9:
        int sum = arr[2] + arr[5] + arr[7] + arr[9];
        System.out.println("Sum of the elements in indexes 2,5,7 and 9 are: " + sum);
        System.out.println();

        //SWAP INDEX 2 and 6;
        int empty;
        empty  = arr[2];
        arr[2] = arr[6];
        arr[6] = empty;

        //SWAP INDEX 4 and 7:
        int empty1;
        empty1 = arr[4];
        arr[4] = arr[7];
        arr[7] = empty1;
        System.out.println("After Swap: ");
        System.out.println(Arrays.toString(arr));

        sum = arr[2] + arr[5] + arr[7] + arr[9];
        System.out.println("The sum of all indexes at 2,5,7 and 9: " + sum);

    }


}
