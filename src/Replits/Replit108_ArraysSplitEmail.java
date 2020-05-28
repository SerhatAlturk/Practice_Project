package Replits;

import java.util.Scanner;

public class Replit108_ArraysSplitEmail                                                                              //Date: 12 Apr 2020 -- Time: 5:37 PM
{

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String email = input.nextLine();

        int a = 0;
        for(int i = 0; i < email.length() - 1; i++)
        {
            if(email.charAt(i) == '@')
            {
                a++;
            }
        }

        if(a == 1)
        {
            String id = email.substring(0, email.indexOf("@"));
            String domain = email.substring(email.indexOf("@") + 1);

            System.out.println("Email id: " + id);
            System.out.println("Email domain: " + domain);
        }
        else
        {
            System.out.println("invalid email");
        }
    }

}
