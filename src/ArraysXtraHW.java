import java.util.Scanner;

public class ArraysXtraHW {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter an integer greater than 0: ");
        int user = scan.nextInt();

        //WHILE loop for positive number input:
        while (user < 1) {
            System.out.print("Enter an integer greater than 0: ");
            user = scan.nextInt();
        }

        System.out.println("Array on one line:");

        //Create an Array:
        int[] arr = new int[user];

        //Print random array numbers on one line:
        int min = 1;
        int max = 500;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * ((500 - 1)) + 1);
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.print("Maximum: " + maximum(arr));
        System.out.println();
        System.out.print("Minimum: " + minimum(arr));
        System.out.println();
        System.out.print("Sum: " + sum(arr));
        System.out.println();
        System.out.print("Average: " + avg(arr));
        System.out.println();
        System.out.print("Number of integers greater than the average: " + gta(arr));
        System.out.println();
        System.out.print("Number of times subsequent value increases: " + countinc(arr));
        System.out.println();
        System.out.print("Number of times subsequent value decreases: " + countdec(arr));
        System.out.println();
        System.out.println("Array with 3 elements per line: ");
        print3(arr);

    }

    //GET MAX METHOD:
    public static int maximum(int[] arr1) {
        int max1 = arr1[0];
        for (int i = 1; i < arr1.length; i++) {
            if (max1 < arr1[i]) {
                max1 = arr1[i];
            }
        }
        return max1;
    }

    //GET MIN METHOD:
    public static int minimum(int[] arr1) {
        int min1 = arr1[0];
        for (int i = 1; i < arr1.length; i++) {
            if (min1 > arr1[i]) {
                min1 = arr1[i];
            }
        }
        return min1;
    }

    //GET SUM METHOD:
    public static int sum(int[] arr1) {
        int sum = 0;
        for (int i = 0; i < arr1.length; i++) {
            sum += arr1[i];

        }
        return sum;
    }

    // GET AVERAGE
    public static double avg(int[] arr1) {
        int avg;
        int sum = 0;
        for (int i = 0; i < arr1.length; i++) {
            sum += arr1[i];
        }
        avg = sum / arr1.length;
        return avg;
    }

    //GREATER THAN AVERAGE METHOD:
    public static int gta(int[] arr1)
    {
        int gta =0;
        double avg = avg(arr1);
        for (int i = 0; i < arr1.length; i++)
        {
            if (arr1[i] > avg)
            {
                gta += 1;
            }
        }
             return gta;
    }
            // SUBSEQUENT INCREASES
               public static int countinc(int[] arr1) {
              int inc = 0;
            for (int i = 0; i < arr1.length - 1; i++) {
                if (arr1[i] < arr1[i + 1]) {
                    inc += 1;
                }
            }
            return inc;
    }


                 // SUBSEQUENT DECREASES
                public static int countdec(int[] arr1)
    {
                int dec = 0;
                for (int i = 0; i < arr1.length - 1; i++)
                {
                    if (arr1[i] > arr1[i + 1])
                    {
                        dec += 1;
                    }
                }
                return dec;
            }

            public static void print3(int[] arr1)
            {
                int count =0;
                for (int i = 0; i < arr1.length; i++)
                    {
                        System.out.print(arr1[i] + " ");
                        count += 1;
                        if (count == 3)
                        {
                            System.out.println();
                            count =0;
                        }

                    }



            }



}