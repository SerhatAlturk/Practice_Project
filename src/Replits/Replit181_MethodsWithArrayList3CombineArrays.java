package Replits;

import java.util.ArrayList;

public class Replit181_MethodsWithArrayList3CombineArrays                                                                  //Date: 30 Apr 2020 -- Time: 9:25 PM
{
    public static String combineRs(String[] r1, String[] r2)
    {
        ArrayList<String> arr = new ArrayList<String>();
        int count = 0;
        for(String s : r1)
        {
            arr.add(count, s);
            count++;
        }
        for(String s : r2)
        {
            arr.add(count, s);
            count++;
        }

        String c = "";

        for(int i = 0; i < arr.size(); i++)
        {
            String g = arr.get(i);
            c += "" + g;
        }

        return c;


    }
}
