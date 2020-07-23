package InterviewQuestions;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;

public class String_FrequencyOfCharacters
{
	public static void main(String[] args)
	{
		//Write a return method that can find the frequency of characters
		//Ex:  FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
		
		System.out.println(FrequencyOfChars("AAAABBBCCCDDCSS"));
		System.out.println(FrequencyOfChars2("AAAABBBCCCDDCSS"));
		System.out.println(FrequencyOfChars3("AAAABBBCCCDDCSS"));
		System.out.println(myMethod("AAAABBBBCCCCDDDD"));
	}
	
	//My Own code
	public static String myMethod(String str)
	{
		char[] str_char_arr = str.toCharArray();
		
		char[] stored_chars = new char[str_char_arr.length];
		int[] frequency_of_chars = new int[str_char_arr.length];
		for (int i = 0; i < str_char_arr.length; i++)
		{
			char current_char = str_char_arr[i];
			int count = 0;
			
			for (char each:str_char_arr)
			{
				if (each==current_char)
				{
				 count++;
				}
			}
			stored_chars[i] = current_char;
			frequency_of_chars[i] = count;
		}
		String last_report = "";
		for (int i = 0; i < stored_chars.length ; i++)
		{
			if (!last_report.contains(""+stored_chars[i]))
			{
				last_report+= stored_chars[i]+""+frequency_of_chars[i];
			}
		}
		return last_report;
	}
	
	
	//solutions
	public static String FrequencyOfChars(String str)
	{
		String nonDup = "";
		for (int i = 0; i < str.length(); i++)
		{
			if (!nonDup.contains("" + str.charAt(i)))
			{
				nonDup += "" + str.charAt(i);
			}
		}
		String expectedResult = "";
		for (int j = 0; j < nonDup.length(); j++)
		{
			int count = 0;
			for (int i = 0; i < str.length(); i++)
			{
				if (str.charAt(i) == nonDup.charAt(j))
				{
					count++;
				}
			}
			expectedResult += nonDup.charAt(j) + "" + count;
		}
		return expectedResult;
	}
	
	public static String FrequencyOfChars2(String str)
	{
		String expectedResult = "";
		int j = 0;
		while (j < str.length())
		{
			int count = 0;
			for (int i = 0; i < str.length(); i++)
			{
				if (str.charAt(i) == str.charAt(j))
				{
					count++;
				}
			}
			expectedResult += str.charAt(j) + "" + count;
			str = str.replace("" + str.charAt(j), "");
		}
		return expectedResult;
	}
	
	public static String FrequencyOfChars3(String str)
	{
		String b = new LinkedHashSet<>(Arrays.asList(str.split(""))).toString();
		b = b.replace(", ", "").replace("[", "").replace("]", "");
		String result = "";
		for (int j = 0; j < b.length(); j++)
		{
			int count = 0;
			for (int i = 0; i < str.length(); i++)
				if (str.substring(i, i + 1).equals("" + str.charAt(j)))
					
					count++;
			result += b.substring(j, j + 1) + count;
		}
		return result;
	}
	
	public static String frequency(String str)
	{
		String nonDup = "", result = "";
		for (int i = 0; i < str.length(); i++)
			if (!nonDup.contains("" + str.charAt(i)))
			{
				nonDup += "" + str.charAt(i);
			}
		for (int i = 0; i < nonDup.length(); i++)
		{
			int num = Collections.frequency(Arrays.asList(str.split("")), "" + nonDup.charAt(i));
			result += "" + nonDup.charAt(i) + num;
		}
		return result;
	}
}
