package Replits;

import java.util.Scanner;

public class Replit101_ArraysPrintFirtsLastChar1        //Date: 09 Apr 2020 -- Time: 10:24 PM
	{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		String[] words = {input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine()};


		for (int i = 0; i < 5; i++)
		{
			words[i] = words[i].charAt(0) + "" + words[i].charAt(words[i].length() - 1);
			System.out.println(words[i]);
		}
	}

	}
