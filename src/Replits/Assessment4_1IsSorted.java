package Replits;

import java.util.Arrays;

public class Assessment4_1IsSorted                                                                  //Date: 26 Apr 2020 -- Time: 4:14 PM
	{
	public static boolean isSort(int[] nums)
	{
		int[] arr1 = new int[nums.length];
		for (int i = 0; i < nums.length; i++)
		{
			arr1[i] = nums[i];
		}
		Arrays.sort(nums);
		String c = Arrays.toString(nums);
		String d = Arrays.toString(arr1);
		return c.equals(d);
	}
	}
