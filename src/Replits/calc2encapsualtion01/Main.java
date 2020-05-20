package Replits.calc2encapsualtion01;

public class Main   //Created at: 11:15 PM - May, 18, 2020
{
	public static void main(String[] args)
	{
        Calc a = new Calc();
        a.setX(1);
        a.setY(1);
        a.plus();
        System.out.println("1+1 = "+ a.getResult());//1+1 = 2
    }
}
