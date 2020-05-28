package Replits;

/*
Instructions from your teacher:
Complete the mystery method so that it takes in an integer array as a parameter,
and then modifies each element based on whether it's even or odd.
If the number is even, divide it by 2.
If it's odd, multiply it by 10.
 */
public class AlterArray   //Created at: 11:04 PM - May, 07, 2020
{
    public static void main(String[] args)
    {
        int[] a = {1, 2, 3, 4, 5};
        mystery(a);
        for(int e : a)
        {
            System.out.print(e + " ");
        }
        // should print out 10 1 30 2 50
    }

    public static void mystery(int[] array)
    {
        int temp = 0;
        int define;
        for(int i = 0; i < array.length; i++)
        {
            define = array[i] % 2;
            if(define == 0) array[i] /= 2;
            else array[i] *= 10;
        }
    }
}
