package Replits;

import java.util.Scanner;

public class Replit35_GiftCardArithmeticOperators
    {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String item = scanner.nextLine();

        int a = 0;
        if (item.equals("Smartphone"))
        {
            System.out.println("Sorry, not enough funds on your gift card!");
        }
        else if (item.equals("Laptop"))
        {
            System.out.println("Sorry, not enough funds on your gift card!");
        }
        else if (item.equals("Charger"))
        {
            a = 100 - 15;
            System.out.println("Thank you for your purchase! ");
            System.out.println("Your current balance is: " + a + "$");
        }
        else if (item.equals("USB cable"))
        {
            a = 100 - 10;
            System.out.println("Thank you for your purchase! ");
            System.out.println("Your current balance is: " + a + "$");
        }
        else if (item.equals("Headphones"))
        {
            a = 100 - 30;
            System.out.println("Thank you for your purchase! ");
            System.out.println("Your current balance is: " + a + "$");
        }
        else if (item.equals("Pants"))
        {
            a = 100 - 50;
            System.out.println("Thank you for your purchase! ");
            System.out.println("Your current balance is: " + a + "$");
        }
        else if (item.equals("Hat"))
        {
            a = 100 - 25;
            System.out.println("Thank you for your purchase! ");
            System.out.println("Your current balance is: " + a + "$");
        }
        else if (item.equals("Socks"))
        {
            a = 100 - 5;
            System.out.println("Thank you for your purchase! ");
            System.out.println("Your current balance is: " + a + "$");
        }
        else if (item.equals("Blanket"))
        {
            a = 100 - 60;
            System.out.println("Thank you for your purchase! ");
            System.out.println("Your current balance is: " + a + "$");
        }
        else if (item.equals("Pillow"))
        {
            a = 100 - 40;
            System.out.println("Thank you for your purchase! ");
            System.out.println("Your current balance is: " + a + "$");
        }
        else
        {
            System.out.println("Invalid Item!");
        }
    }
    }
