package Replits;

public class Replit161_MethodWithReturn6WaterTax                                                                  //Date: 18 Apr 2020 -- Time: 11:57 AM
	{

	public double waterTax(double units)
	{
		double bill = 0.0;

		//your code here
		if (units <= 50)
		{
			bill = units * 0.60;
			return bill;
		}
		if (units > 50 && units <= 100)
		{
			bill = units * 0.90;
			return bill;
		}
		if (units > 100 && units <= 150)
		{
			bill = (units * 0.90) + 50;
			return bill;
		}
		if (units > 150)
		{
			bill = (units * 0.90) + 100;
			return bill;
		}


		//end your code here


		{
			return bill;
		}
	}//end waterTax


	}
