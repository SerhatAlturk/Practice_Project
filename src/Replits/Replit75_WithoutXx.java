package Replits;

import java.util.Scanner;

public class Replit75_WithoutXx
	{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		String word = scan.next();

		if (word.startsWith("x") || word.startsWith("X"))
		{
			word = word.substring(1);
		}
		if (word.endsWith("x") || word.endsWith("X"))
		{
			word = word.substring(0, word.length() - 1);
		}
		System.out.println(word);

			/*
			Given a string word, if the first or last chars are 'x' or 'X', print the string without those 'x' or 'X' chars,  otherwise print the string unchanged.

			Example:
			input: xHiX
			output: Hi

			Example:
			input: apple
			output: apple

			input: xUxL
			output: UxL

			input: JavaX
			output: Java
			 */


	}
	}
