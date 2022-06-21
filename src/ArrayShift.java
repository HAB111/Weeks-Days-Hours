import java.util.Scanner;
import java.util.Arrays;

public class ArrayShift
{
    Scanner scan = new Scanner(System.in);

    public static void main(String[] args)
    {
      int[] arr =  {2, 3, 9, 17, 32, 40, 73, 40, 21, 10};
        System.out.println("Before Shifting: ");
        System.out.println(Arrays.toString(arr));
        System.out.println();
        System.out.println("After Shifting: ");

        int shift= arr[0];
        for(int i = 0; i < arr.length-1; i++)
        {
            arr[i] = arr[i+1];

        }
          arr[9] = shift;
          System.out.println(Arrays.toString(arr));



            //        i = 0
//            i = s1
//                s1= s2
//
    }
}
