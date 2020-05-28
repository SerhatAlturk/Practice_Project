package Replits;

import java.util.Scanner;

public class Replit35_Words
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String word1 = scanner.next();
        String word2 = scanner.next();


        if(word1.equals(word2))
        {
            System.out.println("word1 equals word2");
        }

        else
        {
            System.out.println("word1 does not equal word2");
        }
    }
}
