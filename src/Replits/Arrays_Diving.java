package Replits;

import java.util.Arrays;
import java.util.Scanner;

/*
In the sport of diving, seven judges award a score between 0 and 10, where each score may be a floating-point value.
The highest and lowest scores are thrown out, and the remaining scores are added together. The sum is then multiplied by the degree of difficulty for that dive.
The degree of difficulty ranges from 1.2 to 3.8 points. The total is then multiplied by 0.6 to determine the divers score.
 */

public class Arrays_Diving   //Created at: 3:33 PM - May, 11, 2020
{
    public static void main(String[] args)
    {
        //WRITE YOUR CODES HERE
        Scanner Scanner = new Scanner(System.in);

        float[] judgePoints = new float[7];
        float difficulty = 0;
        float rawSum = 0;

        for(int i = 0; i < 7; i++)
        {
            System.out.println("Enter score for judge " + (i + 1) + ":");
            judgePoints[i] = Scanner.nextFloat();

            if(i == 6)
            {
                System.out.println("Enter difficulty:");
                difficulty = Scanner.nextFloat();
            }
        }

        Arrays.sort(judgePoints);
        judgePoints[0] = 0;
        judgePoints[6] = 0;

        for(float each : judgePoints)
        {
            rawSum += each;
        }

        float total = rawSum * difficulty * 0.6f;

        // FINAL OUTPUT
        System.out.printf("Total: %.2f", total);
    }
}
