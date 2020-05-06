package Replits;

public class Replit156_MethodsWithReturn1CountAppearance                                                                  //Date: 18 Apr 2020 -- Time: 11:13 AM
	{

	public int count_appearance(String[] arr, String t)
	{
		int count = 0;
		for (int i = 0; i < arr.length; i++)
		{
			if (arr[i].equals(t))
			{
				count++;
			}
		}
		return count;
	} //end  count_appearance


	}
