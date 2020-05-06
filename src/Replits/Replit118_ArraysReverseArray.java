package Replits;

import java.util.Arrays;
import java.util.Scanner;

public class Replit118_ArraysReverseArray        //Date: 12 Apr 2020 -- Time: 4:47 PM
	{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int[] nums = {input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt()};

		// write your code below

		int a = 6;

		for (int i = 0; i < nums.length / 2; i++)
		{
			int temp = nums[i];
			nums[i] = nums[a];
			nums[a] = temp;
			a--;
		}

		//Do not change below statement:

		System.out.println(Arrays.toString(nums));

	}

	}
