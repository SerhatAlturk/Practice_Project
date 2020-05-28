package Replits;

public class Replit159_MethodsWithReturn4ProfitOrLoss                                                                  //Date: 17 Apr 2020 -- Time: 7:27 PM
{
    public static String c_profits(int buyPrice, int sellPrice)
    {
        //your code here
        if(buyPrice > sellPrice)
        {
            return "loss";
        }
        if(sellPrice > buyPrice)
        {
            return "profit";
        }
        else
        {
            return "no loss";
        }
    }

    public static void main(String[] args)
    {
        System.out.println(c_profits(10, 100));
    }

}
