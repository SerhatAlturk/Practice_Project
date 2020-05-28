package Replits;

import java.util.Scanner;
/*
Given a time in 12-hour AM/PM format, convert it to military (24-hour) time.
Note: Midnight is 12:00:00AM on a 12-hour clock, and 00:00:00 on a 24-hour clock. Noon is 12:00:00PM on a 12-hour clock, and 12:00:00 on a 24-hour clock.
Function Description
It should print a new string representing the input time in 24 hour format.
timeConversion has the following parameter(s):

Input: 07:05:45PM
Output: 19:05:45
 */

public class TimeConversion1   //Created at: 6:57 PM - May, 11, 2020
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        timeConversion(scan.nextLine());
    }

    public static void timeConversion(String s)
    {
        /*
         * Write your code here.
         */
        if(s.endsWith("AM"))
        {
            s = s.substring(0, s.length() - 2);
            System.out.println(s);
        }
        else
        {
            int hour = Integer.parseInt(s.substring(0, s.indexOf(":")));
            hour += 12;
            System.out.println(hour + "" + s.substring(s.indexOf(":"), s.length() - 2));
        }


    }
}
