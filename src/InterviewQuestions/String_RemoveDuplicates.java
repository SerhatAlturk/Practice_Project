package InterviewQuestions;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class String_RemoveDuplicates
{
	/*
	Write a return method that can remove the duplicated values from String
	Ex:  removeDup("AAABBBCCC")  ==> ABC
	 */
	public static void main(String[] args)
	{
		System.out.println(myCode("AAAABBBBCCCCDDDD"));
	}
	
	//My code
	public static String myCode(String str)
	{
		String no_duplicates = "";
		char[] str_chars = str.toCharArray();
		
		for (int i = 0; i < str_chars.length; i++)
		{
			if (!no_duplicates.contains("" + str_chars[i]))
			{
				no_duplicates += str_chars[i];
			}
		}
		return no_duplicates;
	}
	
	//Solution
	public static String removeDup(String str)
	{
		
		str = new LinkedHashSet<String>(Arrays.asList(str.split(""))).toString();
		
		str = str.replace(", ", "").replace("[", "").replace("]", "");
		
		return str;
		
	}
}
