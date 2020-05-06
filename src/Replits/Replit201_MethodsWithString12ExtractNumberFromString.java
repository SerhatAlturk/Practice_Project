package Replits;

public class Replit201_MethodsWithString12ExtractNumberFromString                                 //Date: 05 May 2020 -- Time: 7:44 PM
{
public static String extractNum(String s)
{
	char[] arr = s.toCharArray();
	String CleanStr = "";

	for (char each : arr)
	{
		if (Character.isDigit(each))
		{
			CleanStr += each;
		}
	}
	return CleanStr;
}

public static void main(String[] args)
{
	String a = "123fiveguys123";

	System.out.println(extractNum(a));
}
}
