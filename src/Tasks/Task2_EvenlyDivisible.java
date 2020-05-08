package Tasks;      //Created at: 3:30 PM - May, 06, 2020

import java.util.Scanner;

/*
2. write a program that can check if a number is evenly divisible by 2, 3, 5,
            Ex:
                number = 65;
            output:
                65 is divisible by 2: false
                65 is divisible by 3: false
                65 is divisible by 5: true

 */
public class Task2_EvenlyDivisible
{
	public static void main(String[] args)
	{
		Scanner Input=new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num=Input.nextInt();
		boolean condition1, condition2, condition3;
		condition1=num%2==0;
		condition2=num%3==0;
		condition3=num%5==0;

		System.out.println(num+" is divisible by 2: "+condition1);
		System.out.println(num+" is divisible by 3: "+condition2);
		System.out.println(num+" is divisible by 5: "+condition3);
	}
}
