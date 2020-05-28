package Replits;

import java.util.Scanner;

public class Replit84_ZombieAttack1
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int inhabitants = scan.nextInt();

        int c = inhabitants;
        for(int i = 0; i < inhabitants + 1; i++)
        {
            if(inhabitants == 0)
            {
                System.out.println("---- EXTINCT ----");
                break;
            }
            System.out.println("Day " + i + " [" + c + "]");

            c /= 2;
            if(c == 0)
            {
                System.out.println("---- EXTINCT ----");
                break;
            }
        }
    }
}
