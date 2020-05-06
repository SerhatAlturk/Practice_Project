package Replits;

import java.util.ArrayList;

public class Replit199_MethodsWithArrayListsDeliveryCalc                                                                  //Date: 05 May 2020 -- Time: 6:13 PM
	{
	public static int refuel_times(ArrayList<Integer> deliveries, int max_fuel)
	{
		int all = 0;
		for (int each : deliveries)
		{
			all += each;
		}
		int temp = all / max_fuel;
		if (all % max_fuel > 0)
		{
			temp++;
		}
		return temp;

	}

	public static void main(String[] args)
	{

		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(3);
		arr.add(3);
		arr.add(1);
		arr.add(2);
		arr.add(6);
		int times = refuel_times(arr, 3);
		System.out.print(times);//should output 5


	}//end main
	}
