package Replits;

import java.util.Scanner;

public class Assessment3_1CarFactory                                                                              //Date: 14 Apr 2020 -- Time: 5:29 PM
	{

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		String model = scan.next();
		int year = scan.nextInt();
		boolean recalled = false;

		if (year >= 2010 && year <= 2012 && model.equals("Extravagant") || year >= 2015 && year <= 2018 && model.equals("Guzzler"))
		{
			recalled = true;
			System.out.println(recalled);
		}
		else
		{
			System.out.println(recalled);
		}

	}

	}
