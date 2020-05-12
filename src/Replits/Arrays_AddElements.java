package Replits;

import java.util.*;
/*
Method addElements accepts 2 int arrays and adds each element value of two arrays and returns a new array. You can assume that each array has 5 elements

addElements(new int[][10, 40, 50, 3, 1],
            new int[][11, 0, 500, 44, 1101]);
--------
return array after adding values in the arrays:
             [21, 40, 550, 47, 1102]

 */
public class Arrays_AddElements   //Created at: 8:10 PM - May, 11, 2020
{
	public static int[] addElements(int[] ints1, int[] ints2)
	{
		int[] lastArr = new int[5];

		for(int i=0; i<5; i++)
		{
			lastArr[i]= ints1[i]+ints2[i];
		}
		return lastArr;
	}

	public static void main(String[] args)
	{
		int[] arr1 = {1,2,3,4,5};
		int[] arr2 = {1,2,3,4,5};

		System.out.println(Arrays.toString(addElements(arr1, arr2)));
	}
}
