package Replits;

import java.util.Scanner;

public class Replit120_ArraysPrintShortestWord                                                                              //Date: 13 Apr 2020 -- Time: 8:10 PM
{

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String[] str = {scan.next(), scan.next(), scan.next(), scan.next(), scan.next(), scan.next()};

        int i = 0;
        String J = str[0];
        for(String each : str)
        {

            if(each.length() < J.length())
            {
                J = each;
            }
            i++;
        }

        System.out.println(J);
    }

}
