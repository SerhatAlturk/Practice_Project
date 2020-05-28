package Replits;

import java.util.Scanner;

public class Replit78_CarInsurance
{
    //4/5/2020

    public static void main(String[] args)
    {
        double premium = 0;
        int accidentsAmount = 0;
        int daysDrivenToWorkOrSchool = 0;
        int milesToWorkOrSchool = 0;
        String vehicleOwnership = "";
        String vehicleUsage = "";
        String continuousInsurance = "";
        String education = "";
        String name = "";
        String referenceNumber = "";
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the CountyFarm car insurance!");

        System.out.println("Enter your name");
        name = scan.nextLine();

        System.out.println("Do you have a US driver license?");
        String licnese = scan.next();

        if(licnese.equalsIgnoreCase("no"))
        {
            System.out.println("Invalid data!");
            System.exit(0);
        }
        else
        {
            System.out.println("Enter your zip code");
            int zip = scan.nextInt();

            if(zip == 20910 || zip == 20740)
            {
                premium += 60;
            }
            else if(zip == 22102 || zip == 22103)
            {
                premium += 30;
            }
            else
            {
                premium += 50;
            }

            System.out.println("\n TEST TEST TEST " + premium + "\n");// ----------------------------TEST TEST TEST----------------

            System.out.println("Is this vehicle Owned, Financed, or Leased?");
            vehicleOwnership = scan.next();

            if(vehicleOwnership.equalsIgnoreCase("owned"))
            {
                premium += 10;
            }
            else
            {
                premium += 20;
            }
            System.out.println("\n TEST TEST TEST " + premium + "\n");// ----------------------------TEST TEST TEST----------------

            System.out.println("How is this vehicle primarily used?");
            vehicleUsage = scan.next();

            if(vehicleUsage.equalsIgnoreCase("Business"))
            {
                premium += 50;
            }
            if(vehicleUsage.equalsIgnoreCase("Pleasure"))
            {
                premium += 10;
            }
            if(vehicleUsage.equalsIgnoreCase("Commute"))
            {
                premium += 20;

                System.out.println("Days Driven To Work And/Or School");
                daysDrivenToWorkOrSchool = scan.nextInt();

                for(int i = 0; i < daysDrivenToWorkOrSchool; i++)
                {
                    premium += 5;
                }

                System.out.println("Miles Driven To Work And/Or School");
                milesToWorkOrSchool = scan.nextInt();

                for(int a = 0; a < milesToWorkOrSchool; a++)
                {
                    premium += 1;
                }
            }


            System.out.println("\n TEST TEST TEST " + premium + "\n");// ----------------------------TEST TEST TEST----------------

            System.out.println("How old are you?");
            int age = scan.nextInt();

            if(age < 16)
            {
                System.out.println("Invalid data!");
                System.exit(0);
            }
            if(age >= 16 && age < 18)
            {
                premium *= 20;
            }
            if(age >= 18 && age <= 21)
            {
                premium *= 6;
            }
            if(age > 21 && age < 25)
            {
                premium *= 2;
            }

            System.out.println("\n TEST TEST TEST " + premium + "\n");// ----------------------------TEST TEST TEST----------------


            System.out.println("How many years you've been driving?");
            int year = scan.nextInt();
            int exp = age - year;
            if(exp <= 16 && year < 1)
            {
                System.out.println("Invalid data!");
                System.exit(0);
            }

            for(int z = 0; z < year; z++)
            {
                premium -= 5;

            }

            System.out.println("\n TEST TEST TEST " + premium + "\n");// ----------------------------TEST TEST TEST----------------

            System.out.println("Have you had any accidents in the last 5 years?");
            String answer = scan.next();

            if(answer.equalsIgnoreCase("yes"))
            {
                System.out.println("How many?");
                accidentsAmount = scan.nextInt();
                double k = (premium / 100) * 20;
                for(int y = 0; y < accidentsAmount; y++)
                {
                    premium += k;
                }
            }

            System.out.println("\n TEST TEST TEST " + premium + "\n");// ----------------------------TEST TEST TEST----------------

            System.out.println("Have you had continuous insurance for the past 12 months?");
            continuousInsurance = scan.next();

            if(continuousInsurance.equalsIgnoreCase("no"))
            {
                premium *= 2;
            }

            System.out.println("\n TEST TEST TEST " + premium + "\n");// ----------------------------TEST TEST TEST----------------

            scan.nextLine();
            System.out.println("What is the highest level of education you have completed?");
            education = scan.nextLine();

            if(education.equals("PhD") || education.equals("Bachelors") || education.equals("Masters"))
            {
                premium -= (premium / 100) * 5;
            }
            if(education.equals("Doctors"))
            {
                premium -= (premium / 100) * 10;
            }
            if(education.equals("Less than High School"))
            {
                premium += (premium / 100) * 5;
            }
            education = education.replaceAll(" ", "");
            System.out.println(name + ", here's your quote!");
            System.out.println("Start Your Policy Today For: $" + premium);

            String last = "" + name.substring(name.length() - 2);
            referenceNumber = "" + name.substring(0, 2) + "" + age + "" + last + "" + zip + "" + education;
            referenceNumber = referenceNumber.toUpperCase();
            System.out.println("Reference number: " + referenceNumber);
        }

    }


}
