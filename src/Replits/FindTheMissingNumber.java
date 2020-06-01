package Replits;

import java.util.Arrays;

public class FindTheMissingNumber
{
    public static void main(String[] args)
    {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(missingNumber(arr));
    }

    public static int missingNumber(int[] arr)
    {
        int[] arrtemp = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Arrays.sort(arr);
        int count = 0;
        int temp = -1;
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] != arrtemp[count])
            {
                temp = arrtemp[count];
                break;
            }
            count++;
        }
        if(temp==-1)
        {
            temp = 10;
        }
        return temp;
    }

    /*
    public static int missingNumber(int[] arr)
    {
        int temp = 0;
        int count = 1;
        Arrays.sort(arr);
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i]!=count)
            {
                temp = count;
                count++;
            }
            count++;
        }
        return temp;
    }

 */
}
