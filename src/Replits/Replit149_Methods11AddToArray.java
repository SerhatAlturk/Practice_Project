package Replits;

import java.util.Arrays;
import java.util.Scanner;

public class Replit149_Methods11AddToArray                                                                  //Date: 17 Apr 2020 -- Time: 8:39 PM
{

    public static void add_to_r(int[] r, int n)
    {
        //create new array with one more position.
        int[] new_r;
        new_r = new int[r.length + 1];
        for(int i = 0; i < r.length; i++)
        {
            new_r[i] = r[i];
        }

        new_r[r.length] = n;

        System.out.println(Arrays.toString(new_r));


    }

    public static void main(String[] args)
    {


        Scanner inp = new Scanner(System.in);
        int size = inp.nextInt(), n = inp.nextInt();
        int[] arr = new int[size];
        for(int i = 0; i <= size - 1; i++)
        {

            arr[i] = inp.nextInt();
        }

        add_to_r(arr, n);


    }

}
