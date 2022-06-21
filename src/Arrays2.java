import java.util.Scanner;

public class Arrays2
{
        public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number from 1 to 20: ");
        int user = scan.nextInt();

        if (user <1 || user>20)
        {
            System.out.println("Error! Number entered has to be between 1 & 20. Try again.");
        }
        else {
            int[] arr = {1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, 2048, 4096, 8192, 16384, 32768, 65536, 131072, 262144, 524288};

            for (int i = 0; i < user; i++) {
                System.out.println(arr[i]);
            }
        }
                    }

}


