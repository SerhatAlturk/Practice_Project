package Extras;

import java.util.Scanner;

public class StringRows
{
	/*
	Enter row: 9
*********
*XyXyXyX*
*XyXyXyX*
*XyXyXyX*
*XyXyXyX*
*XyXyXyX*
*XyXyXyX*
*XyXyXyX*
*********
Enter row: 10
**********
*XyXyXyXy*
*XyXyXyXy*
*XyXyXyXy*
*XyXyXyXy*
*XyXyXyXy*
*XyXyXyXy*
*XyXyXyXy*
*XyXyXyXy*
**********
	 */
	
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter row: ");
		int a = scanner.nextInt();
		
		for (int i = 0; i < a; i++)
		{
		if (i==0)
		{
			for (int j = 0; j <a ; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
			String b = "";
			System.out.print("*");
			int j = 0;
			b+="X";
			while (j < a - 1)
			{
				if (b.charAt(j)=='y')
				{
					b+="X";
				}
				else b+="y";
				j++;
			}
			System.out.print(b);
			System.out.println("*");
			if (i==a-1)
			{
				for (int z = 0; z <a ; z++)
				{
					System.out.print("*");
				}
				System.out.println();
			}
		}
	}
}
