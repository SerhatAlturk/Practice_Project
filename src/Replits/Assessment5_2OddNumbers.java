package Replits;

import java.util.Scanner;

public class Assessment5_2OddNumbers                                                                  //Date: 26 Apr 2020 -- Time: 4:53 PM
	{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.print("#1: ");
		int num1 = s.nextInt();
		System.out.print("#2: ");
		int num2 = s.nextInt();
		//start on line 11
		for (int i = 0; i > -1; i++)
		{
			if (num1 % 2 != 0)
			{
				System.out.print(num1 + " ");
			}
			num1++;

			if (num1 > num2)
			{
				break;
			}
		}
	}
	}
