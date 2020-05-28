package Replits;

public class Assessment2_1PrintOddNumbers
{
    //4/6/2020
    public static void main(String[] args)
    {
        for(int a = 11; a < 122; a++)
        {
            if(a % 2 != 0)
            {
                System.out.print(a + " ");
            }
        }
    }
}
