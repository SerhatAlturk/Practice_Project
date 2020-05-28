package Replits.Pluralizer;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner inp = new Scanner(System.in);
        System.out.print("# in:");
        int amt = inp.nextInt();
        inp.nextLine(); //this line is necessary
        System.out.print("word:");
        String word = inp.nextLine();
        //leave the above unedited, write your code below:

        if(amt == 1)
        {
            System.out.println("1 " + word);
        }
        else
        {
            if(word.endsWith("fe"))
            {
                word = word.substring(0, word.length() - 2) + "ves";
                System.out.println(amt + " " + word);
            }
            else if(word.endsWith("sh") || word.endsWith("ch"))
            {
                word = word + "es";
                System.out.println(amt + " " + word);
            }
            else if(word.endsWith("us"))
            {
                word = word.substring(0, word.length() - 2) + "i";
                System.out.println(amt + " " + word);
            }
            else if(word.endsWith("y"))
            {
                if(word.endsWith("ay") || word.endsWith("oy") || word.endsWith("ey") || word.endsWith("uy"))
                {
                    word = word + "s";
                    System.out.println(amt + " " + word);
                }
                else
                {
                    word = word.substring(0, word.length() - 1) + "ies";
                    System.out.println(amt + " " + word);
                }
            }
            else
            {
                word = word + "s";
                System.out.println(amt + " " + word);
            }
        }
    }
}
