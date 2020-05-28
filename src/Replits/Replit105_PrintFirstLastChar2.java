package Replits;

import java.util.Arrays;
import java.util.Scanner;

public class Replit105_PrintFirstLastChar2        //Date: 10 Apr 2020 -- Time: 10:22 AM
{

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String[] words = {input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine()};


        for(int i = 0; i < words.length; i++)
        {
            String a = words[i];
            a = a.charAt(0) + "" + a.charAt(a.length() - 1);
            words[i] = a;

        }
        System.out.println(Arrays.toString(words));
    }

}
