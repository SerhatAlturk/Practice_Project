package Replits;

import java.util.Arrays;
import java.util.Scanner;

public class Replit83_PartyLoopScanner        //Date: 11 Apr 2020 -- Time: 1:35 PM
	{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		String[] a = new String[100];
		int count = 1;
		for (int i = 0; i < 100; i++)
		{
			System.out.println("Please enter guest name:");
			a[i] = input.next();
			count += a[i].length();


			System.out.println("Do you want to enter new guest name:");
			String c = input.next();

			if (c.equalsIgnoreCase("yes"))
			{
				count += 2;
				continue;
			}
			if (c.equalsIgnoreCase("no"))
			{
				break;
			}
		}
		String g = Arrays.toString(a);
		g = g.substring(1, count);
		System.out.println("Guest's list: " + g);


	}

	}
