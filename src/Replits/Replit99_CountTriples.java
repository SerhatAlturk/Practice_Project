package Replits;

import java.util.Scanner;

public class Replit99_CountTriples
{
    //4/4/2020
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int count = 0;

        for(int a = 0; a < str.length() - 2; a++)
        {
            char b = str.charAt(a);
            char c = str.charAt(a + 1);
            char d = str.charAt(a + 2);
            if(b == c && b == d)
            {
                count += 1;

            }
        }
        System.out.println(count);
    }

}
