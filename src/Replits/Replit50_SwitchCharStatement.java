package Replits;

import java.util.Scanner;

public class Replit50_SwitchCharStatement
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter command:");
        char response = scanner.next().charAt(0);

        switch(response)
        {
            case 'y':
                System.out.println("Your request is being processed");
                break;
            case 'n':
                System.out.println("Thank you anyway for your consideration");
                break;
            case 'h':
                System.out.println("Sorry, no help is currently available");
                break;
            default:
                System.out.println("Invalid entry, please try again!");
        }
    }
}
