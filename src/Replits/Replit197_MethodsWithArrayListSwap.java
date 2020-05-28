package Replits;

import java.util.ArrayList;

public class Replit197_MethodsWithArrayListSwap                                                                  //Date: 30 Apr 2020 -- Time: 10:10 PM
{
    public static ArrayList<String> swap(ArrayList<String> list, int pos1, int pos2)
    {
        String c = list.get(pos1);
        String g = list.get(pos2);
        list.set(pos1, g);
        list.set(pos2, c);

        return list;

    }

    public static void main(String[] args)
    {

    }//end main
}
