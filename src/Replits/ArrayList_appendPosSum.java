package Replits;

import java.util.*;

/*
Create a static method that:

is called appendPosSum
returns an ArrayList of Integers
takes one parameter: an ArrayList of Integers

This method should:
Create a new ArrayList of Integers
Add only the positive Integers to the new ArrayList
Sum the positive Integers in the new ArrayList and add the Sum as the last element

For example, if the incoming ArrayList contains the Integers (4,-6,3,-8,0,4,3), the ArrayList that gets returned should be (4,3,4,3,14), with 14 being the sum of (4,3,4,3).  The original ArrayList should remain unchanged.
 */
public class ArrayList_appendPosSum   //Created at: 8:17 PM - May, 11, 2020
{
	public static void main(String[] args)
	{
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(3);
		list.add(-2);
		ArrayList<Integer> go = appendPosSum(list);
		System.out.println(go);
	}
	//create your method below
	public static ArrayList<Integer> appendPosSum(ArrayList<Integer> aList)
	{
		ArrayList<Integer> pos = new ArrayList<Integer>();
		int temp;
		int count = 0;
		for(Integer integer : aList)
		{
			temp=integer;
			if(temp>0)
			{
				pos.add(temp);
				count+=temp;
			}
		}
		pos.add(count);
		return pos;
	}
}
