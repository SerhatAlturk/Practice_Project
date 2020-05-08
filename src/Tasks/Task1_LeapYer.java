package Tasks;      //Created at: 2:48 PM - May, 06, 2020

import java.util.Scanner;
/*
     1. create a class called LeapYear, and write a program that can identify if the given is Leap Year, print true if it's leap year, otherwise print false
        Ex:
            year = 2020
        output:
            2020 is leap year: true
 */

public class Task1_LeapYer
{
	public static void main(String[] args)
	{
		Scanner Input=new Scanner(System.in);
		System.out.print("Enter Year: ");
		int varY=Input.nextInt();
		if(varY%4==0) System.out.println(varY+" is a leap year");
		else if(varY%100!=0)
		{
			if(varY%400==0) System.out.println(varY+" is a leap year");
			else System.out.println(varY+" is not a leap year");
		}
		else System.out.println(varY+" is not a leap year");
	}
}
