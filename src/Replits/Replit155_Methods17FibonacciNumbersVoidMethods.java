package Replits;

import java.util.Scanner;

public class Replit155_Methods17FibonacciNumbersVoidMethods                                                                  //Date: 22 Apr 2020 -- Time: 10:16 PM
	{

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		fib(num);
	}

	public static void fib(int num)
	{
		//WRITE YOUR CODE HERE
		int[] f = new int[num + 2];
		f[0] = 0;
		f[1] = 1;

		for (int i = 2; i <= num; i++)
		{
			f[i] = f[i - 1] + f[i - 2];
		}

		System.out.println(f[num]);


	}

	}
