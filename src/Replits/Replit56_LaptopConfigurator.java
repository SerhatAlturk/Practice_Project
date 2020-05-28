package Replits;

import java.util.Scanner;

public class Replit56_LaptopConfigurator
{
    public static void main(String[] args)
    {
        double price = 0;
        String storageType, screenType, cpu;
        int ram = 0;
        Scanner scan = new Scanner(System.in);

        System.out.println("Select screen size:");
        screenType = scan.next();
        switch(screenType)
        {
            case "13.3":
                price += 200;
                break;
            case "15.0":
                price += 300;
                break;
            case "17.3":
                price += 400;
                break;
            default:
        }

        System.out.println("Select CPU type:");
        cpu = scan.next();
        switch(cpu)
        {
            case "i3":
                price += 150;
                break;
            case "i5":
                price += 250;
                break;
            case "i7":
                price += 350;
                break;
            default:
        }

        System.out.println("Select RAM size:");
        ram = scan.nextInt();
        for(int a = 0; a < ram; a += 4)
        {
            price += 50;
        }

        System.out.println("Select storage type:");
        storageType = scan.next();
        if(storageType.equals("HDD"))
        {
            System.out.println("Enter memory size:");
            int memory = scan.nextInt();
            for(int i = 0; i < memory; i += 500)
            {
                price += 50;
            }
        }
        if(storageType.equals("SSD"))
        {
            System.out.println("Enter memory size:");
            int memory = scan.nextInt();
            for(int b = 0; b < memory; b += 500)
            {
                price += 100;
            }
        }

        System.out.println("Enter screen resolution:");
        String res = scan.next();
        switch(res)
        {
            case "FULLHD":
                price += 100;
                break;
            case "4K":
                price += 200;
        }

        System.out.println("Laptop price is: $" + price);
    }
}
