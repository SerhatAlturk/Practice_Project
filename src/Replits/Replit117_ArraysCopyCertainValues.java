package Replits;

import java.util.Arrays;

public class Replit117_ArraysCopyCertainValues                                                                              //Date: 13 Apr 2020 -- Time: 7:29 PM
	{

	public static void main(String[] args)
	{
		System.out.println("-----EXAMPLE RUN ---------");
		String[] numbers = {"zero", "one", "two", "three", "four"};
		System.out.println(Arrays.toString(getWithE(numbers)));
	}


	public static String[] getWithE(String[] arr)
	{

		//TODO : YOUR CODE GOES HERE ----------------------
		int j = 0;
		int count = 0;
		String[] fewValues;
		for (int i = 0; i < arr.length; i++)
		{
			if (arr[i].contains("e"))
			{
				count++;
			}
		}

		fewValues = new String[count];
		for (String each : arr)
		{
			if (each.contains("e"))
			{
				fewValues[j] = each;
				j++;
			}
		}

		//YOUR CODE ENDS HERE -----------------------

		return fewValues;
	}


	}
