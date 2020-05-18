package Replits.StoreProductClass;

public class StoreProduct   //Created at: 2:36 PM - May, 16, 2020
{
	String label, category;
	int price, stock;
	boolean hasExpiration;

	public StoreProduct(String label, int price, String category, boolean hasExpiration, int stock)
	{
		this.label=label;
		this.price=price;
		this.category=category;
		this.hasExpiration=hasExpiration;
		this.stock=stock;
	}

	public StoreProduct(String label, int price, int stock)
	{
		this.label=label;
		this.price=price;
		this.category="misc";
		this.hasExpiration=false;
		this.stock=stock;
	}
	public StoreProduct(String label, int price)
	{
		this.label=label;
		this.price=price;
		this.stock=0;
	}
	public StoreProduct(String label, int price, String category,boolean hasExpiration)
	{
		this.label=label;
		this.price=price;
		this.category=category;
		this.hasExpiration=hasExpiration;
	}

	public void expired(boolean hasExpired)
	{
		if(hasExpiration&&hasExpired)
		{
			this.stock=0;
		}
	}

	public boolean sale(int quantity)
	{
		if(stock>=quantity)
		{
			this.stock-=quantity;
			return true;
		}
		else
		{
			return false;
		}
	}
	public double getDiscountedPrice(double discount)
	{
		return this.price*(1-discount);
	}
}
