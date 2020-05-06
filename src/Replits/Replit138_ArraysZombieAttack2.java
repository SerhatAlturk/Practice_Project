package Replits;

import java.util.Arrays;
import java.util.Scanner;

public class Replit138_ArraysZombieAttack2                                                                  //Date: 15 Apr 2020 -- Time: 3:13 PM
	{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int[] inhabitants = new int[8];
		for (int i = 0; i < inhabitants.length; i++)
		{
			inhabitants[i] = input.nextInt();
		}

		//TODO. Write you code below this line.

		int count = 0;
		int c = inhabitants.length;
		System.out.println("Day 0 " + Arrays.toString(inhabitants));
		for (int i = 0; i < 20; i++)
		{
			for (int j = 0; j < c; j++)
			{
				if (j == 0)
				{
					if (inhabitants[j + 1] == 0 && inhabitants[j] != 0)
					{
						inhabitants[j] /= 2;
					}
				}
				else if (j == c - 1)
				{
					if (inhabitants[j - 1] == 0 && inhabitants[j] != 0)
					{
						inhabitants[j] /= 2;
					}
				}
				else
				{
					if (inhabitants[j + 1] == 0 || inhabitants[j - 1] == 0)
					{
						inhabitants[j] /= 2;
					}
				}
			}


			System.out.println("Day " + (i + 1) + " " + Arrays.toString(inhabitants));

			for (int each : inhabitants)
			{
				if (each == 0)
				{
					count++;
				}
			}
			if (count == c)
			{
				System.out.println("---- EXTINCT ----");
				break;
			}
			count = 0;
		}

	}
	}
