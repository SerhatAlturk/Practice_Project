package Practice;

import java.time.LocalDate;

public class Birthday                                                                  //Date: 23 Apr 2020 -- Time: 1:48 PM
	{
	//Shows us how to store LocalDate type of object in arrays.
	public static void main(String[] args)
	{
		String[] arr1 = {"Misem", "Harun", "Faysel"};

		LocalDate harunB = LocalDate.of(2020, 3, 5);
		LocalDate misemB = LocalDate.of(2000, 10, 12);
		LocalDate fayselB = LocalDate.of(2010, 5, 6);
		LocalDate[] birthdays = {harunB, misemB, fayselB};
		for (int i = 0; i < arr1.length; i++)
		{
			String name = arr1[i];
			LocalDate bd = birthdays[i];
			System.out.println(name + "'s birthday is " + bd);

		}
		int a = 100;
		int b = 200;
		int c = 300;

		int[] array1 = {a, b, c};

		//Added from GitHub


	}

	}
