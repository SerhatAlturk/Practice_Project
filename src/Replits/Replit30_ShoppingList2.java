package Replits;

import java.util.Scanner;

public class Replit30_ShoppingList2
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Item1, count and its price:");
        String Item1 = scan.next();
        int count1 = scan.nextInt();
        double price1 = scan.nextDouble();

        System.out.println("Enter Item2, count and its price:");
        String Item2 = scan.next();
        int count2 = scan.nextInt();
        double price2 = scan.nextDouble();


        System.out.println("Enter Item3, count and its price:");
        String Item3 = scan.next();
        int count3 = scan.nextInt();
        double price3 = scan.nextDouble();


        double totalPrice = 0;
        String report = "";

        if(count1 == 0)
        {
            totalPrice = (count2 * price2) + (count3 * price3);
            report = "Item2: " + Item2 + " Price: " + (count2 * price2) + ", Item3: " + Item3 + " Price: " + (count3 * price3);
        }
        if(count2 == 0)
        {
            totalPrice = (count1 * price1) + (count3 * price3);
            report = "Item1: " + Item1 + " Price: " + (count1 * price1) + ", Item3: " + Item3 + " Price: " + (count3 * price3);
        }
        if(count3 == 0)
        {
            totalPrice = (count1 * price1) + (count2 * price2);
            report = "Item1: " + Item1 + " Price: " + (count1 * price1) + ", Item2: " + Item2 + " Price: " + (count2 * price2);
        }

        System.out.println(report);
        System.out.println("Total price: " + totalPrice);
    }
}
