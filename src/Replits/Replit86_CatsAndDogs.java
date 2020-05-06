package Replits;

import java.util.Scanner;

public class Replit86_CatsAndDogs
	{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int countOfCats = 0;
		int countOfDogs = 0;
		String word = scan.next();

		countOfCats = word.length() - word.replaceAll("cat", "").length();
		countOfCats /= 3;

		countOfDogs = word.length() - word.replaceAll("dog", "").length();
		countOfDogs /= 3;

		System.out.println(countOfCats == countOfDogs);
	}
	}
