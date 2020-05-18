package Replits.StockClass;


import java.text.DecimalFormat;

public class Stock   //Created at: 4:50 PM - May, 18, 2020
	{
	public String tickerSymbol;
	public String companyName;
	public int price;
	public double percentChange;
	public int totalShares;
	public long marketCap;
	
	DecimalFormat Formatter = new DecimalFormat("##.##");
	
	public Stock(String tickerSymbol, String companyName, int price, int totalShares)
		{
			this.tickerSymbol = tickerSymbol.toUpperCase();
			this.companyName = companyName;
			this.price = price;
			this.totalShares = totalShares;
			marketCap = totalShares * price;
		}
	
	// DO NOT CHANGE THE METHOD BELOW
	public void adjustPrice(int value)
		{
			int temp = price;
			price = price + (value);
			percentChange = ((double) (price - temp)) / temp;
			marketCap = totalShares * price;
		}
	
	public String toString()
		{
			String a = Formatter.format(percentChange);
			String temp = symbol() + "" + a;
			
			return "Ticker Symbol: " + tickerSymbol +
			       "\nCompany: " + companyName +
			       "\nCurrent Price: $" + price + " (" + temp + "%)" +
			       "\nMarket Cap: $" + marketCap;
		}
	
	public String symbol()
		{
			if(percentChange > 0)
				{
					return "+";
				}
			else
				{ return ""; }
		}
		
	}
