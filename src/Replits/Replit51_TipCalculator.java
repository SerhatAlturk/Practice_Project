package Replits;

import java.util.Scanner;

public class Replit51_TipCalculator
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Split:");
        String Split = scanner.next();
        System.out.print("\nNumber of people:");
        int NumberOfPeople = scanner.nextInt();
        System.out.print("\nCheck amount:");
        double Check = scanner.nextDouble();
        System.out.print("\nService Quality:");
        String ServiceQuality = scanner.next();
        System.out.println();

        double TotalPay;
        double TotalTip;
        double TotalPerPerson;
        double TipPerPerson;
        double TipRate = 0;

        if(ServiceQuality.equals("Poor"))
        {
            TipRate = 5;
        }
        else if(ServiceQuality.equals("Fair"))
        {
            TipRate = 10;
        }
        else if(ServiceQuality.equals("Good"))
        {
            TipRate = 15;
        }
        else if(ServiceQuality.equals("Great"))
        {
            TipRate = 20;
        }
        else if(ServiceQuality.equals("Excellent"))
        {
            TipRate = 25;
        }
        else
        {
            System.out.println("Error");
        }

        switch(Split)
        {
            case "Yes":
                TotalTip = (Check / 100) * TipRate; //25
                TotalPay = Check + TotalTip; //525
                TipPerPerson = TotalTip / NumberOfPeople; //5
                TotalPerPerson = TotalPay / NumberOfPeople; //105

                System.out.print("Number of people entered: ");
                for(int i = 0; i < NumberOfPeople; i++)
                {
                    System.out.print("&"); //0 1 2 3 4
                }

                System.out.println();
                System.out.println("Total to pay: " + TotalPay);
                System.out.println("Total tip: " + TotalTip);
                System.out.println("Total per person: " + TotalPerPerson);
                System.out.println("Tip per person: " + TipPerPerson);
                break;
            case "No":
                TotalTip = (Check / 100) * TipRate;
                TotalPay = TotalTip + Check;
                System.out.println("Total to pay: " + TotalPay);
                System.out.println("Total tip: " + TotalTip);
                break;
            default:
                System.out.println("Test");
        }


    }
}
