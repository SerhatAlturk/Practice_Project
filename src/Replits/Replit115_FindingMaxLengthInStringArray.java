package Replits;

import java.util.Scanner;

public class Replit115_FindingMaxLengthInStringArray        //Date: 11 Apr 2020 -- Time: 4:54 PM
{

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String[] words = new String[5];
        for(int i = 0; i < 5; i++)
        {

            words[i] = input.nextLine();

        }

        String c = "";
        int a = 0;
        int b = 0;
        String d = "";

        for(int i = 0; i < 5; i++)
        {
            c = words[i];
            a = c.length();
            if(a > b)
            {
                b = a;
                d = words[i];
            }

        }
        System.out.println(d);
    }

}
