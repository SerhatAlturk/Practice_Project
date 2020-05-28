package Replits;

import java.util.Scanner;

public class Replit91_CountHiLoopString        //Date: 11 Apr 2020 -- Time: 1:23 PM
{

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        int count = 0;
        for(int i = 0; i < str.length() - 1; i++)
        {
            if(str.startsWith("hi", i))
            {
                count++;
            }
        }
        System.out.println(count);

    }

}
