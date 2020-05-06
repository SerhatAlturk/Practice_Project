package Replits;

import java.util.Scanner;

public class Replit65_MiddleThree
    {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();

        if (word.length() % 2 != 0 && word.length() >= 5)
        {
            int a = word.length() / 2;
            int b = word.length() / 2 - 1;
            int c = word.length() / 2 + 1;

            char d = word.charAt(b);
            char e = word.charAt(a);
            char f = word.charAt(c);

            System.out.println(d + "" + e + "" + f);
        }
        else
        {
            System.out.println("invalid");
        }
    }
    }
