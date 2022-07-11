package MaxOfEachLine;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MaximumOfEachLine
{
    public static void main(String[] args)
    {
        File f1 = new File("C:\\Users\\HamadBangash\\IdeaProjects\\Weeks Days Hours\\src\\MaxOfEachLine\\data.txt");

        try
        {
            Scanner scan = new Scanner(f1);

           while(scan.hasNext())
           {
               String s = scan.nextLine();
               String s1 = s.replace(",", " ");
               String[] arr = s1.split(" ");

               int max = Integer.parseInt(arr[2]);
               for(int i =3; i < arr.length; i++)
               {
                    int index = Integer.parseInt(arr[i]);
                    if(max < index)
                    {
                        max=index;
                    }
               }
               System.out.println(arr[0] + " " + arr[1] + "  " + "Max: " + max);
           }

        }

        catch (FileNotFoundException e)
        {
            System.out.println("File Not Found");
        }

    }

}
