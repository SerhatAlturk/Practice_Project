package InterviewQuestions;

public class String_Reverse
{
	/*
	Write a return method that can reverse  String
	Ex: Reverse("ABCD"); ==> DCBA
	 */
	public static void main(String[] args)
	{
		System.out.println(myCode("abcd"));
	}
	
	//my code
	public static String myCode(String str)
	{
		char[] str_chars = str.toCharArray();
		String reversed_str = "";
		
		for(int i = str_chars.length-1; i > -1; i--)
		{
			reversed_str += str_chars[i];
		}
		return reversed_str;
	}
	
	//task solutions
	public static String StrReverse(String str)
	{
		String reverse = "";
		for(int i = str.length()-1; i >= 0; i--)
			reverse += str.toCharArray()[i];
		return reverse;
	}
	
	public static String Reverse(String str)
	{
		return new StringBuffer(str).reverse().toString();
	}
}
