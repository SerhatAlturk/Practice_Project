package Replits;

import java.util.Scanner;

public class Replit154_Methods16CheckIfNumberIsPalindrome                                                                  //Date: 22 Apr 2020 -- Time: 9:35 PM
	{

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		isPalindrome(num);
	}

	public static void isPalindrome(int num)
	{
		//WRITE YOUR CODE HERE
		int b;
		int count = 0;
		int a;
		a = num;
		while (num > 0)
		{
			b = num % 10;
			count = (count * 10) + b;
			num = num / 10;
		}
		if (a == count)
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}


	}

	}
