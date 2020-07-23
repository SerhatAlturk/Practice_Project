package InterviewQuestions;

import java.util.Arrays;
import java.util.Collections;

public class String_FindTheUnique
{
	/*
	Write a return  method that can find the unique characters from the String
	Ex:  unique("AAABBBCCCDEF")  ==>  "DEF";
	 */
	public static void main(String[] args)
	{
		System.out.println(myCode("AABBCCDDDDDDDDDGHTJJJJJJ"));
	}
	
	//My Code
	public static String myCode(String str)
	{
		char[] str_chars = str.toCharArray();
		
		String unique_chars = "";
		for(int i = 0; i < str_chars.length; i++)
		{
			int count = 0;
			for(int j = 0; j < str_chars.length; j++)
			{
				if(str_chars[i] == str_chars[j])
				{
					count++;
				}
			}
			if(count == 1)
			{
				unique_chars += str_chars[i];
			}
		}
		return unique_chars;
	}
	
	//solutions
	public static String unique(String str)
	{
		String[] arr = str.split("");
		String unique1 = "";
		for(int j = 0; j < arr.length; j++)
		{
			int num = 0;
			for(int i = 0; i < arr.length; i++)
			{
				if(arr[i].equals(arr[j]))
					num++;
			}
			if(num == 1)
				unique1 += arr[j];
		}
		return unique1;
	}
	
	public static String Unique(String str)
	{
		String result = "";
		for(String each : str.split(""))
			result += ((Collections.frequency(Arrays.asList(str.split("")), each)) == 1) ? each : "";
		return result;
	}
}
