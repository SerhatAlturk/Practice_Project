package Replits;

import java.util.Scanner;

public class Replit104_Has55        //Date: 10 Apr 2020 -- Time: 9:55 AM
	{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int[] nums = {input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt()};

		int count = 0;
		for (int i = 0; i < nums.length - 1; i++)
		{
			if (nums[i] == nums[i + 1] && nums[i] == 5)
			{
				count++;
			}
		}
		System.out.println(count > 0);
	}

	}
