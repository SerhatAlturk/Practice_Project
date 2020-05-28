package Replits;

import java.util.Scanner;

public class Replit108_PrintTriangle
{

    public static void main(String[] args)
    {
        int i = 1;
        int j = 1;
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        String a = "";
        for(i = 0; i < n; i++)
        {
            a += "*";
            System.out.println(a);
        }
    }

}
