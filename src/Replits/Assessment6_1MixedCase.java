package Replits;

import java.util.Scanner;

public class Assessment6_1MixedCase                                                                  //Date: 26 Apr 2020 -- Time: 5:03 PM
{
    public static void main(String[] args)
    {
        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String s = inp.nextLine();
        //write your code below
        String a = "";
        for(int i = 0; i < s.length(); i++)
        {
            if(i == 0)
            {
                a = a + "" + s.substring(i, i + 1).toLowerCase();
            }
            if(i > 0)
            {
                if(i % 2 != 0)
                {
                    a = a + "" + s.substring(i, i + 1).toUpperCase();
                }
                else
                {
                    a = a + "" + s.substring(i, i + 1).toLowerCase();
                }
            }
        }
        System.out.println(a);
    }
}
