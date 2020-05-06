package Replits;

import java.util.Scanner;

public class Replit147_Methods9IsPosVoidMethods                                                                  //Date: 22 Apr 2020 -- Time: 10:34 AM
	{

	public static void main(String[] args)
	{
		Scanner inp = new Scanner(System.in);
		int size = inp.nextInt();

		int[] arr = new int[size];
		for (int i = 0; i <= size - 1; i++)
		{

			arr[i] = inp.nextInt();
		}
		//#2 Your code here

		for (int each : arr)
		{
			isPos(each);
		}

	}

	public static void isPos(int num)
	{
		//#1 your code here
		if (num > 0)
		{
			System.out.println("positive");
		}
		else
		{
			System.out.println("not positive");
		}

	}

	}
