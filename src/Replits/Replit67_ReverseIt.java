package Replits;

import java.util.Scanner;

public class Replit67_ReverseIt
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();

        if(word.length() > 5)
        {
            System.out.println("Too long!");
        }
        else if(word.length() < 5)
        {
            System.out.println("Too short!");
        }
        else
        {
            char a = word.charAt(4);
            char b = word.charAt(3);
            char c = word.charAt(2);
            char d = word.charAt(1);
            char e = word.charAt(0);
            System.out.println(a + "" + b + "" + c + "" + d + "" + e);
        }
    }
}
