package Replits;

/*
Instructions from your teacher:
Complete the method so that it takes in a 2-D array and returns the sums of the rows as an integer array.

For example, the if we run rowSums for the following 2D array:
{
  {1,1,2}, //sum = 4
  {3,1,2}, //sum = 6
  {3,5,3}, //sum = 11
  {0,1,2}  //sum = 3
}
Then we should get the following array back:
{4,6,11,3}
 */
public class RowSum   //Created at: 9:45 PM - May, 07, 2020
{
    public static void main(String[] args)
    {
        int[][] a = {
                {1, 1, 2}, //sum = 4
                {3, 1, 2}, //sum = 6
                {3, 5, 3}, //sum = 11
                {0, 1, 2}  //sum = 3
        };
        int[] sums = rowSums(a);
        for(int sum : sums)
            System.out.println(sum);
        //this should print 4 6 11 3
    }

    public static int[] rowSums(int[][] nums)
    {
        int count = 0;
        int[] sum = new int[nums.length];
        for(int i = 0; i < nums.length; i++)
        {
            int[] temp = nums[i];
            for(int j = 0; j < temp.length; j++)
            {
                count += temp[j];
            }
            sum[i] = count;
            count = 0;
        }
        return sum;
    }
}
