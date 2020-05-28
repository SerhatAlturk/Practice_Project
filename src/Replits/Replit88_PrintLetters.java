package Replits;

import java.util.Scanner;

public class Replit88_PrintLetters
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        char start = scan.next().charAt(0);
        char end = scan.next().charAt(0);

        int a = start;
        int b = end;

        for(int i = a; i <= b; i++)
        {
            char z = (char) i;
            System.out.print(z);
        }


    }
}
