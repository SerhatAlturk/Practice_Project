package Replits.StockClass;

public class Main   //Created at: 4:50 PM - May, 18, 2020
	{
	public static void main(String[] args)
		{
			Stock stock1 = new Stock("abc","Google, Inc.",1000,200);
			stock1.adjustPrice(123123);
			System.out.println(stock1);
		}
	}
