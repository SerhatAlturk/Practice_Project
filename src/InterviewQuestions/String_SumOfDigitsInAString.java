package InterviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class String_SumOfDigitsInAString
{
	/*
	Write a method that can return the sum of the digits in a string
	 */
	public static void main(String[] args)
	{
		System.out.println(myCode("123"));
	}
	
	//My Code
	public static int myCode(String str)
	{
		String[] str_chars = str.split("");
		String[] numbers = {"1","2","3","4","5","6","7","8","9","0"};
		int str_numbers_sum = 0;
		for (String each : str_chars)
		{
			int count = 0;
		    for (String each_numbers : numbers)
		    {
		        if(each.equals(each_numbers))
		        {
		        	count++;
		        }
		    }
		    if(count == 1)
		    {
		    	int temp = Integer.parseInt(each);
			    System.out.println(temp);
		    	str_numbers_sum += temp;
		    }
		}
		return str_numbers_sum;
	}
	
	//task solution
	public static int sumOfDigits(String s)
	{
		int total = 0;
		char[] ch = s.toCharArray();
		for(char each : ch)
		{
			if(Character.isDigit(each))
			{
				total += (int) each;
			}
		}
		return total;
	}
}
