package Replits;

import java.util.Scanner;

public class Replit95_GetSandwich
	{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		String str = scan.next();

		int count = 0;
		char a;
		if (str.contains("bread"))
		{
			str = str.replaceAll("bread", " ");

			for (int i = 0; i <= str.length() - 1; i++)
			{
				a = str.charAt(i);
				if (a == ' ')
				{
					count++;
				}
			}
			if (count > 1)
			{
				str = str.substring(str.indexOf(" ") + 1, str.lastIndexOf(" "));

				if (str.contains(" "))
				{
					str = str.replaceAll(" ", "bread");
					System.out.println(str);
				}
				else
				{
					System.out.println(str);
				}
			}
			else
			{
				System.out.println("nothing");
			}
		}
		else
		{
			System.out.println("nothing");
		}
	}
	}
