package Replits;

import java.util.*;

/*
Given an int array, print a new array with double the length where its last element is the same as the original array, and all the other elements are 0.
The original array will be length 1 or more. Note: by default, a new int array contains all 0's.
 */
public class Arrays_MakeLast   //Created at: 8:00 PM - May, 11, 2020
{
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		int size=scan.nextInt();
		int[] nums=new int[size];
		for(int i=0; i<size; i++)
		{
			nums[i]=scan.nextInt();
		}
		//WRITE YOUR CODE HERE
		int[] arr2 = new int[size*2];
		for(int i=0; i<arr2.length; i++)
		{
			if(i==arr2.length-1)
			{
				arr2[i] = nums[size-1];
			}
		}
		System.out.println(Arrays.toString(arr2));
	}
}
