package Replits;

import java.util.Arrays;
import java.util.Scanner;

public class Replit121_ArraysPrintShortestWord2                                                                  //Date: 15 Apr 2020 -- Time: 1:33 PM
{

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        String[] arr = str.split(", ");
        int a = 20000;
        int count = 0;
        for(String each : arr)
        {
            if(each.length() < a)
            {
                a = each.length();
            }
        }

        for(int h = 0; h < arr.length; h++)
        {
            if(arr[h].length() == a)
            {
                count++;
            }
        }
        String[] arr2 = new String[count];
        int c = 0;
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i].length() == a)
            {
                arr2[c] = arr[i];
                c++;
            }
        }
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));
    }

}
