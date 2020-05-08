package Replits;

import java.util.Arrays;

/*
Instructions from your teacher:
Switch the last element in an array with the first and return the array.

example:

do_switch([1,2,3,4])
returns:[[4,2,3,1]

do_switch([7,2,3,5])
returns:[5,2,3,7]
 */
public class SwitchElements   //Created at: 10:16 PM - May, 07, 2020
{
	public static void main(String[] args)
	{
		int[] a = {1,2,3,4,5,6,7,8};
		int[] anew = do_switch(a);
		System.out.println(Arrays.toString(anew));
	}
	public static int[] do_switch(int[] i)
	{
		int last=i.length-1;
		int first=0;
		int temp=0;

		temp=i[first];
		i[first]=i[last];
		i[last]=temp;

		return i;
	}
}
