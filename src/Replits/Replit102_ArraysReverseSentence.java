package Replits;

import java.util.Scanner;

public class Replit102_ArraysReverseSentence        //Date: 10 Apr 2020 -- Time: 9:35 AM
{

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();

        int a = sentence.split(" ").length;
        String[] arr = sentence.split(" ");

        for(int t = a - 1; t > -1; t--)
        {
            System.out.println(arr[t]);
        }
    }

}
