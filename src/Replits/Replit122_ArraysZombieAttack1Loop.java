package Replits;

import java.util.Arrays;
import java.util.Scanner;

public class Replit122_ArraysZombieAttack1Loop                                                                  //Date: 14 Apr 2020 -- Time: 9:51 PM
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

		System.out.println("Day 0 " + Arrays.toString(inhabitants));

		for (int j = 1; j > 0; j++)
		{
			for (int i = 0; i < inhabitants.length; i++)
			{
				inhabitants[i] = inhabitants[i] / 2;
			}

			System.out.println("Day " + j + " " + Arrays.toString(inhabitants));
			for (int z = 0; z < inhabitants.length; z++)
			{
				if (inhabitants[z] == 0)
				{
					count++;
				}
			}
			if (count == inhabitants.length)
			{
				break;
			}
			count = 0;
		}
		System.out.println("---- EXTINCT ----");


	}

	}
