package Replits;

/*
Create a class named Pizza that stores information about a single pizza.
It should contain the following:
Private instance variables to store the size of the pizza (either small, medium, or large),
the number of cheese toppings,
the number of pepperoni toppings,
and the number of ham toppings.
    Constructor(s) that set all of the instance variables.
Public methods to get and set the instance variables.
A public method named calcCost( ) that returns a double that is the cost of the pizza.
Pizza cost is determined by:
Small: $10 + $2 per topping
Medium: $12 + $2 per topping
Large: $14 + $2 per topping
A public method named getDescription() that returns a String containing the pizza size, quantity of each topping,
and the pizza cost as calculated by calcCost().

getDescription() example:
large Pizza with 0 Cheese toppings, 0 Pepperoni toppings, and 2 Ham toppings.
Total Price: 18.0

 */
public class Pizza   //Created at: 8:29 PM - May, 14, 2020
{
	private String PizzaSize;
	int CheeseToppings, PepperToppings, HamToppings;

	public Pizza(String PizzaSize, int CheeseToppings, int PepperToppings, int HamToppings)
	{
		this.PizzaSize=PizzaSize;
		this.CheeseToppings=CheeseToppings;
		this.HamToppings=HamToppings;
		this.PepperToppings=PepperToppings;
	}

	public String getPizzaSize()
	{
		return PizzaSize;
	}

	public void setPizzaSize(String pizzaSize)
	{
		PizzaSize=pizzaSize;
	}

	public int getCheeseToppings()
	{
		return CheeseToppings;
	}

	public void setCheeseToppings(int cheeseToppings)
	{
		CheeseToppings=cheeseToppings;
	}

	public int getPepperToppings()
	{
		return PepperToppings;
	}

	public void setPepperToppings(int pepperToppings)
	{
		PepperToppings=pepperToppings;
	}

	public int getHamToppings()
	{
		return HamToppings;
	}

	public void setHamToppings(int hamToppings)
	{
		HamToppings=hamToppings;
	}

	public double calcCost()
	{
		double cost=0;
		if(PizzaSize.equalsIgnoreCase("small"))
		{
			cost=10+(CheeseToppings*2)+(PepperToppings*2)+(HamToppings*2);
		}
		if(PizzaSize.equalsIgnoreCase("medium"))
		{
			cost=12+(CheeseToppings*2)+(PepperToppings*2)+(HamToppings*2);
		}
		if(PizzaSize.equalsIgnoreCase("large"))
		{
			cost=14+(CheeseToppings*2)+(PepperToppings*2)+(HamToppings*2);
		}
		return cost;
	}

	public String getDescription()
	{
		/*
		getDescription() example:
		large Pizza with 0 Cheese toppings, 0 Pepperoni toppings, and 2 Ham toppings.
		Total Price: 18.0
		 */
		return PizzaSize+" Pizza with "+CheeseToppings+" Cheese toppings, "+PepperToppings+" Pepperoni toppings, and "+HamToppings+" Ham toppings.\n" +
		       "Total Price: "+calcCost();
	}
}

class Main
{
	public static void main(String[] args)
	{
		Pizza pizza1 = new Pizza("Small",2,2,2);
		System.out.println(pizza1.getDescription());
	}
}