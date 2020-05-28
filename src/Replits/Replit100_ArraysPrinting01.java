package Replits;

import java.util.Scanner;

public class Replit100_ArraysPrinting01        //Date: 09 Apr 2020 -- Time: 10:16 PM
{

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String[] arr = new String[5];
        for(int i = 0; i < 5; i++)
        {
            arr[i] = input.nextLine();
        }

        for(int j = 0; j < 5; j++)
        {
            arr[j] = arr[j].substring(0, 3);
            System.out.println(arr[j]);
        }
    }

}
