package Replits;

import java.util.Scanner;

public class Assessment1_4CalorieBurned
	{
	//4/6/2020
	public static void main(String[] args)
	{
		double weight = 0;
		double cal = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter weight in pounds:");

		weight = scan.nextDouble();

		double weightK = weight / 2.2;

		cal = 0.0175 * 900 * weightK;
		int cal1 = (int) cal;
		System.out.println("Calories Burned: " + cal1);
	}
	}
