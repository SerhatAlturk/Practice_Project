package Replits;

public class Assessment6_4SwitchElements                                                                  //Date: 26 Apr 2020 -- Time: 5:34 PM
	{
	public static int[] do_switch(int[] i)
	{
		int temp = i[0];
		i[0] = i[i.length - 1];
		i[i.length - 1] = temp;

		return i;
	}
	}