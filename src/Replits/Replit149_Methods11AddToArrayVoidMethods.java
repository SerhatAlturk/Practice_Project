package Replits;

import java.util.Scanner;

public class Replit149_Methods11AddToArrayVoidMethods                                                                  //Date: 22 Apr 2020 -- Time: 7:48 PM
	{

	public static void add_to_r(int[] r, int n)
	{
		//create new array with one more position.
		int[] ar = new int[r.length + 1];

		for (int i = 0; i < r.length; i++)
		{
			ar[i] = r[i];
		}
		ar[r.length] = n;

		for (int a : ar)
		{
			System.out.println(a);
		}

	}

	public static void main(String[] args)
	{


		Scanner inp = new Scanner(System.in);
		int size = inp.nextInt(), n = inp.nextInt();
		int[] arr = new int[size];
		for (int i = 0; i <= size - 1; i++)
		{

			arr[i] = inp.nextInt();
		}

		add_to_r(arr, n);


	}

	}
