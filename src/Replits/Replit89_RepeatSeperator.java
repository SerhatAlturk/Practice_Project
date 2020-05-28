package Replits;

import java.util.Scanner;

public class Replit89_RepeatSeperator
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        String separator = scan.next();
        int count = scan.nextInt();

        for(int a = 0; a < count; a++)
        {
            System.out.print(word);
            if(a == count - 1)
            {
                break;
            }
            System.out.print(separator);
        }
    }
}
