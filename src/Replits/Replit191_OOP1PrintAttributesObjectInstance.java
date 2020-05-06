package Replits;

//Created at: 1:29 AM
// May, 06, 2020
public class Replit191_OOP1PrintAttributesObjectInstance
	{
	public static void main(String[] args)
	{

		Atts a = new Atts();
		a.name = "ball";
		a.color = "red";
		a.amount = 1;


		System.out.println(a.asString());
	}

	static class Atts
	{
		String name;
		String color;
		int amount;

		public String asString()
		{
			return "name: " + name + " color: " + color + " amount: " + amount;
		}
	}
	}
