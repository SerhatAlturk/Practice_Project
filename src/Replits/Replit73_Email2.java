package Replits;

import java.util.Scanner;





/*
Write a program that will print out information about user based on email. Print first and last name from the upper case.

Example:
Input: craig_federighi@apple.com
Output:
First name: Craig
Last name: Federighi
Domain: apple
Top-Level Domain: com
 */

public class Replit73_Email2
    {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String email = scan.nextLine();

        String Fname = email.substring(0, email.indexOf("_"));
        String Lname = email.substring(email.indexOf("_") + 1, email.indexOf("@"));
        String domain = email.substring(email.indexOf("@") + 1, email.indexOf("."));
        String TPDomain = email.substring(email.indexOf(".") + 1);

        Fname = Fname.substring(0, 1).toUpperCase() + "" + Fname.substring(1).toLowerCase();
        Lname = Lname.substring(0, 1).toUpperCase() + "" + Lname.substring(1).toLowerCase();


        //System.out.println(Fname+"   "+Lname+"   "+domain+"   "+TPDomain);

        System.out.println("First name: " + Fname);
        System.out.println("Last name: " + Lname);
        System.out.println("Domain: " + domain);
        System.out.println("Top-Level Domain: " + TPDomain);

    }
    }
