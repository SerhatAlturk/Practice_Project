package Replits;

import java.util.Scanner;

public class Replit107_ArraysCountEvens        //Date: 10 Apr 2020 -- Time: 10:49 AM
{

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt()};

        int count = 0;

        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] % 2 == 0)
            {
                count++;
            }
        }
        System.out.println(count);
    }

}
