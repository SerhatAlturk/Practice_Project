package Replits;

public class Replit176_MethodOverloading1                                                                  //Date: 26 Apr 2020 -- Time: 12:18 AM
	{

	public int findMax(int[] a)
	{
		int b = 0;
		for (int each : a)
		{
			if (each > b)
			{
				b = each;
			}
		}
		return b;
	}

	public double findMax(double[] a)
	{
		double g = 0;
		for (double each : a)
		{
			if (each > g)
			{
				g = each;
			}
		}
		return g;
	}

	}
