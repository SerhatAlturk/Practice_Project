package Replits.CarpetClass;

public class Main   //Created at: 5:50 PM - May, 16, 2020
{
	public static void main(String[] args)
	{
		Carpet c=new Carpet();
		System.out.println(c.totalPrice);

		Carpet c2=new Carpet(20.0, 20.0, 2.0, false);
		System.out.println(c2.totalPrice); // 80

		Carpet c3=new Carpet(20.0, 20.0, 2.0, true);
		System.out.println(c3.totalPrice); // 280
	}
}

class Carpet
{

	//do not change -- Start
	public double width, length, unitPrice, totalPrice;
	public boolean isPersian;
	//do not change -- End

	//Add constructors below
	public Carpet()
	{
		this.length=300;
		this.width=300;
		this.totalPrice=200;
		this.isPersian=false;
		this.unitPrice=0;
	}

	public Carpet(double width, double length, double unitPrice, boolean isPersian)
	{
		this.width=width;
		this.length=length;
		this.unitPrice=unitPrice;
		this.isPersian=isPersian;

		this.totalPrice=(width+length)*unitPrice;
		if(isPersian)
		{
			this.totalPrice+=200;
		}
	}
}