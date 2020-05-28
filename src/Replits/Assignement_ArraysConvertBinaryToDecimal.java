package Replits;

import java.util.Scanner;

public class Assignement_ArraysConvertBinaryToDecimal                                                                  //Date: 14 Apr 2020 -- Time: 11:25 PM
{

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int[] binary = new int[8];
        for(int i = 0; i < binary.length; i++)
        {
            binary[i] = input.nextInt();
        }

        //TODO: Write your code below.
        int a = 7;
        double total = 0;
        for(int i = 0; i < 8; i++)
        {
            if(binary[i] == 1)
            {
                total += Math.pow(2, a);
            }
            a--;
        }
        int z = (int) total;
        System.out.println(z);


    }


}
