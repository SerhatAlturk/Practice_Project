package Replits;

import java.util.Scanner;

public class Replit85_ShoppingList2
	{
	//    4/4/2020

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		String shoppingListReport = "";
		String item = "";
		String countinue = "";
		double price = 0;
		int count = 1;
		double totalPrice = 0;

		System.out.println("Enter Item1 and its price:");
		item = scan.next();
		price = scan.nextDouble();

		shoppingListReport = shoppingListReport + "" + "Item" + count + ": " + item + " Price: " + price;
		count++;
		totalPrice += price;

		System.out.println("Add one more item?");
		countinue = scan.next();

		if (countinue.equals("no"))
		{
			System.out.println(shoppingListReport);
			System.out.println("Total price: " + totalPrice);
		}
		else

		{
			do
			{
				System.out.println("Enter Item" + count + " and its price:");
				item = scan.next();
				price = scan.nextDouble();
				shoppingListReport = shoppingListReport + ", Item" + count + ": " + item + " Price: " + price;
				totalPrice += price;
				count++;

				System.out.println("Add one more item?");
				countinue = scan.next();

				if (countinue.equalsIgnoreCase("no"))
				{
					break;
				}

			}

			while (count <= 10);

			System.out.println(shoppingListReport);
			System.out.println("Total price: " + totalPrice);
		}


	}

	}
