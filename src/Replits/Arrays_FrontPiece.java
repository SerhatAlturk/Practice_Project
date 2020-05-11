package Replits;

import java.util.*;

/*
Given an int array of any length, print a new array of its first 2 elements. If the array is smaller than length 2, use whatever elements are present.
 */
public class Arrays_FrontPiece   //Created at: 4:04 PM - May, 11, 2020
{
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		int size=scan.nextInt();
		int[] num=new int[size];
		for(int i=0; i<size; i++)
		{
			num[i]=scan.nextInt();
		}
		//WRITE YOUR CODE HERE

		int[] temp;
		if(size >= 2)
		{
			temp=new int[2];
				temp[0] = num[0];
				temp[1] = num[1];
		}
		else
		{
			temp=new int[1];
				temp[0] = num[0];
		}
		System.out.println(Arrays.toString(temp));


	}
}
