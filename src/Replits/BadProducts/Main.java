package Replits.BadProducts;

public class Main
{
    public static boolean badP(int[] products, int limit)
    {
        boolean temp = true;
        int count = 0;
        for(int each : products)
        {
            if(each==0)
            {
                count++;
                if(count>=limit)
                {
                    temp = false;
                }
            }
        }
        return temp;
    }
}
