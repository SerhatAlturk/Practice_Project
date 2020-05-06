package Replits;

import java.util.Scanner;

public class Replit80_OnlineBookMerchants
	{
	public static void main(String[] args)
	{
		int freeBooks = 0;
		Scanner scan = new Scanner(System.in);
		boolean isPremiumCustomer = scan.nextBoolean();
		int nbooksPurchased = scan.nextInt();

		if (isPremiumCustomer == true)
		{
			if (nbooksPurchased >= 5)
			{
				freeBooks += 1;
			}
			if (nbooksPurchased >= 8)
			{
				freeBooks = 2;
			}
		}
		if (isPremiumCustomer == false)
		{
			if (nbooksPurchased >= 7)
			{
				freeBooks += 1;
			}
			if (nbooksPurchased >= 12)
			{
				freeBooks = 2;
			}
		}

		System.out.println(freeBooks);

			/*
			  Online Book Merchants offers
			premium customers
			1 free book with every purchase of 5
			or more books and offers 2 free books with every purchase of 8 or more books.

			It offers regular customers 1 free book with every purchase of 7 or more books,
			and offers 2 free books with every purchase of 12 or more books.
            Write a program that assigns freeBooks the appropriate value based on
            the values of the boolean variable isPremiumCustomer and the int variable nbooksPurchased.
            Print amount of freeBooks into the console.
			*/
	}
	}
