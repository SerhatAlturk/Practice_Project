package Replits;

import java.util.Scanner;

public class Replit97_EqualsJavPython
	{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		String sentence = scan.nextLine();

		int a, b;

		int countjava = sentence.length() - sentence.replaceAll("java", "").length();
		countjava /= 4;

		int countpython = sentence.length() - sentence.replaceAll("python", "").length();
		countpython /= 6;

		if (countjava == countpython)
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}







			/*
			instructions from your teacher:
			Given a string,
			print out true if
			the number of appearances of "java" anywhere in the string is
			equal to
			the number of appearances of "python" anywhere in the string (case sensitive).

			Example:
			input: We study java not python
			output: true

			Example:
			input: What's the difference between java, javascript and python?
			output: false
			 */
	}
	}
