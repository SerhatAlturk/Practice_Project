package Replits;

import java.util.Scanner;

public class Replit153_Methods15PrintUniqueWordsVoidMethods                                                                  //Date: 22 Apr 2020 -- Time: 9:15 PM
{

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        String[] words = new String[size];
        for(int i = 0; i < size; i++)
        {
            words[i] = scan.next();
        }
        printUniqueWords(words);
    }

    public static void printUniqueWords(String[] words)
    {
        //WRITE YOUR CODE HERE

        int count = 0;
        for(int i = 0; i < words.length; i++)
        {
            for(int j = 0; j < words.length; j++)
            {
                if(words[i].equals(words[j]))
                {
                    count++;
                }
            }
            if(count == 1)
            {
                System.out.println(words[i]);
            }
            count = 0;
        }


    }

}
