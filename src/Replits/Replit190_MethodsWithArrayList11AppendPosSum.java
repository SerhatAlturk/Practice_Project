package Replits;

import java.util.ArrayList;

public class Replit190_MethodsWithArrayList11AppendPosSum                                                                  //Date: 30 Apr 2020 -- Time: 9:45 PM
	{
	public static void main(String[] args)
	{

	}

	//create your method below
	public static ArrayList<Integer> appendPosSum(ArrayList<Integer> arr1)
	{
		int sum = 0;
		ArrayList<Integer> arr1new = new ArrayList<Integer>();
		for (int a : arr1)
		{
			if (a > 0)
			{
				arr1new.add(a);
				sum += a;
			}
		}

		arr1new.add(sum);
		return arr1new;
	}
	}
