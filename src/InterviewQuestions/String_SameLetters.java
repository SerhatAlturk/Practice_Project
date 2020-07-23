package InterviewQuestions;

import java.util.Arrays;

public class String_SameLetters
{
	/*
	Write a return method that check if a string is build out of the same letters as another string.

	Ex:  same("abc",  "cab"); -> true

		same("abc",  "abb"); -> false:
	 */
	
	public static void main(String[] args)
	{
		System.out.println(mycode("baba", "abba"));
	}
	
	public static boolean mycode(String first, String second)
	{
		char[] first_char_arr = first.toCharArray();
		char[] second_char_arr = second.toCharArray();
		
		Arrays.sort(first_char_arr);
		Arrays.sort(second_char_arr);
		
		String first_sorted = "";
		String second_sorted = "";
		for (int i = 0; i < first_char_arr.length; i++)
		{
			first_sorted += first_char_arr[i];
		}
		for (int i = 0; i < second_char_arr.length; i++)
		{
			second_sorted += second_char_arr[i];
		}
		return first_sorted.equals(second_sorted);
	}
	
	//solution
	public static boolean same(String a, String b)
	{
		char[] ch1 = a.toCharArray();
		char[] ch2 = b.toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		String a1 = "", a2 = "";
		for (char each : ch1)
			a1 += each;
		
		for (char each : ch2)
			a2 += each;
		return a1.equals(a2);
	}
}
