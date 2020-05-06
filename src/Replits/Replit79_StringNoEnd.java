package Replits;

import java.util.Scanner;

public class Replit79_StringNoEnd
	{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		String txt = s.next();
		//your code here
		String a = txt.substring(0, txt.length() - 1);
		System.out.println(a);
	}
	}
