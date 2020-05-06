package Replits;

import java.util.Scanner;

public class Replit119_ArraysAverageTemperatureLoops                                                                              //Date: 13 Apr 2020 -- Time: 6:45 PM
	{

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int k = 0;
		double total = 0;
		double avgTemp = 0;
		double[] temps = {scan.nextDouble(), scan.nextDouble(), scan.nextDouble(), scan.nextDouble(), scan.nextDouble(), scan.nextDouble(), scan.nextDouble(), scan.nextDouble()};


		for (double e : temps)
		{
			total += e;
		}

		avgTemp = total / temps.length;

		System.out.println(avgTemp);
	}

	}
