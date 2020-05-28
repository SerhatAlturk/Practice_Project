package Replits;

import java.util.Scanner;

public class Replit87_HasAJava
{
    public static void main(String[] args)
    {
        boolean exists = false;
        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        String c = word.replaceAll("java", "*");
        int a = c.indexOf("*");
        if(a == 0 || a == 1)
        {
            exists = true;
            System.out.println(exists);
        }
        else
        {
            System.out.println(exists);
        }

    }
}
