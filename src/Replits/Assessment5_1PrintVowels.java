package Replits;

import java.util.Scanner;

public class Assessment5_1PrintVowels                                                                  //Date: 26 Apr 2020 -- Time: 4:45 PM
{
    public static void main(String[] args)
    {
        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String word = inp.nextLine();
        //write your code below
        String c = "";
        char[] arr = word.toCharArray();
        for(char each : arr)
        {
            if(each == 'a' || each == 'e' || each == 'i' || each == 'o' || each == 'u')
            {
                c += each;
            }
        }
        System.out.println(c);
    }
}
