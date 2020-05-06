package Replits;

public class Replit165_MethodsWithReturn10ThunderBlazz                                                                  //Date: 26 Apr 2020 -- Time: 5:43 PM
	{
	public static boolean getThunderBlazz(boolean available, boolean gift, int ingredient1, int ingredient2, int ingredient3)
	{
		if (available || gift)
		{
			return true;
		}
		else if (ingredient1 == 1 && ingredient2 == 2 && ingredient3 == 3)
		{
			return true;
		}
		else
		{
			return ingredient1 == 3 && ingredient2 == 1 && ingredient3 == 2;
		}
	}
	}
