package Replits;

import java.util.ArrayList;

public class Replit196_MethodsWithArrayList2Times                                                                  //Date: 30 Apr 2020 -- Time: 10:01 PM
	{
	public static void main(String[] args)
	{

	}

	//create your method below
	public static ArrayList<Integer> twoTimes(ArrayList<Integer> arr)
	{
		ArrayList<Integer> arr1 = new ArrayList<>();
		for (int i : arr)
		{
			arr1.add(i);
			arr1.add(i);
		}

		return arr1;
	}

	}
