package Tasks;      //Created at: 4:01 PM - May, 06, 2020

import java.util.Scanner;

public class Task3_GallonLiter
{
	public static double GtoL(int a)
	{
		return a*3.784;
	}

	public static double LtoG(int a)
	{
		return a/3.784;
	}

	public static void main(String[] args)
	{
		Scanner Input=new Scanner(System.in);
		System.out.println("Enter Number: ");
		int a=Input.nextInt();


	}
}
