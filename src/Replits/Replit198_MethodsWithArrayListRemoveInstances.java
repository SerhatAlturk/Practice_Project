package Replits;

import java.util.ArrayList;
import java.util.Arrays;

public class Replit198_MethodsWithArrayListRemoveInstances                                                                  //Date: 30 Apr 2020 -- Time: 10:17 PM
{
    public static ArrayList<Integer> removeInst(ArrayList<Integer> r, Integer n)
    {
        int c = r.size();
        for(int i = 0; i < c; i++)
        {
            int g = r.get(i);
            if(g == n)
            {
                r.remove(i);
                c--;
                i--;
            }
        }

        return r;

    }

    public static void main(String[] args)
    {

        ArrayList<Integer> arr = new ArrayList<>();
        Integer[] nums = new Integer[]{1, 1, 2, 3};
        arr.addAll(Arrays.asList(nums));

        System.out.print(removeInst(arr, 1));


    }//end main
}
