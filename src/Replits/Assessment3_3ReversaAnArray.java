package Replits;

import java.util.Arrays;

public class Assessment3_3ReversaAnArray                                                                  //Date: 26 Apr 2020 -- Time: 10:47 AM
{

    public static void main(String[] args)
    {
        String[] arr1 = {"First", "Second", "Third"};
        System.out.println(Arrays.toString(reverse(arr1)));
    }

    /**
     * Reverses the order of the elements in the specified array
     *
     * @param arr
     * @return array of strings
     */
    public static String[] reverse(String[] arr)
    {
        String[] arrtemp = new String[arr.length];
        int count = 0;
        for(int i = arr.length - 1; i >= 0; i--)
        {
            arrtemp[count] = arr[i];
            count++;
        }
        for(int j = 0; j < arr.length; j++)
        {
            arr[j] = arrtemp[j];
        }


        return arr;
    }

}
