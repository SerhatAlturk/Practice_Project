package Replits;

import java.util.Arrays;

public class PopulateArray
{
    public static int[] populate(int[] r)
    {
        int count = 1;
        for(int i = 0; i < r.length; i++)
        {
            r[i] = count;
            count++;
        }
        return r;
    }

    public static void main(String[] args)
    {
        int[] i = new int[3];
        i = populate(i);
        System.out.println(Arrays.toString(i));
    }
}
