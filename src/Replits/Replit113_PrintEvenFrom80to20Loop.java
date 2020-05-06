package Replits;

public class Replit113_PrintEvenFrom80to20Loop                                                                              //Date: 13 Apr 2020 -- Time: 5:56 PM
	{

	public static void main(String[] args)
	{
		int[] arr = new int[61];

		int a = 80;

		for (int i = 0; i < 61; i++)
		{
			arr[i] = a;
			a--;
		}

		for (int c : arr)
		{
			if (c % 2 == 0)
			{
				System.out.print(c + " ");
			}
		}
	}

	}
