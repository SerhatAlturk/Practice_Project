package Replits;

import java.util.Scanner;

public class Replit114_ArraysFindNonDuplicate        //Date: 10 Apr 2020 -- Time: 4:25 PM
{

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt()};
        int a = 0;
        int b = 0;
        for(int i = 0; i < nums.length; i++)
        {
            for(int j = 0; j < nums.length; j++)
            {
                if(nums[i] == nums[j])
                {
                    a++;
                }
            }
            if(a == 1)
            {
                b = nums[i];
            }
            a = 0;
        }
        System.out.println(b);

    }

}
