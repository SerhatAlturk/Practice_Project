package Replits;

import java.util.Scanner;

public class Replit45_BurgerOrChickenStringMethods
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String in = scanner.next();

        if(in.equals("burger") || in.equals("chicken"))
        {
            System.out.println("10.0");
        }
        else
        {
            System.out.println("2.0");
        }
    }
}
