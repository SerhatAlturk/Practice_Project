package Replits;

import java.util.*;
/*
Given two positive integers m and n, find their greatest common divisor, that is, the largest positive integer that evenly divides both m and n.
 */
public class Replit237_CommonDivisor   //Created at: 5:21 PM - May, 11, 2020
{
	public static void main(String[] args)
	{
		System.out.println(commonDivisor(15, 25)); //5
		System.out.println(commonDivisor(40, 124)); //4
		System.out.println(commonDivisor(120, 60)); //60
		System.out.println(commonDivisor(80, 60)); //20
	}


	public static int commonDivisor(int m, int n)
	{
		//WRITE YOUR CODE HERE
		int commonDiv=0;
		for(int i = 1;i<=m&&i<=n;i++)
		{
			if(m%i==0&&n%i==0)
			{
				commonDiv=i;
			}
		}
		n = commonDiv;
		return n;
	}
}
