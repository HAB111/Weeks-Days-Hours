import java.util.Scanner;

public class Arrays1 {
    static int user_input; // Global Variable
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        user_input = scan.nextInt();
        int[]  arr  = array(user_input);

        print(arr);
    }

    public static int[] array(int user)
    {
        int[] arr= new int [user];

            int value=122;
            for(int i=0; i<user; i++)
           {
               if(i==2)
               {
                   arr[i]= 244;
               }
               else
               {
                   arr[i] = value;
                   value++;
               }
               }
            return arr;


    }

public static void print( int[]arr )
{
    for(int i=0; i<user_input; i++)
    {
        System.out.print(arr[i]+ " ");
    }
}

}
