package Replits;

import java.util.ArrayList;

public class Replit188_MethodsWithArrayList9RemoveAll                                                                  //Date: 28 Apr 2020 -- Time: 11:22 AM
{
    public static void main(String[] args)
    {
        ArrayList<String> g1 = new ArrayList<String>(5);
        g1.add("hi");
        g1.add("serhat");
        g1.add("hi");
        g1.add("serhat");
        g1.add("hi");
        removeAll(g1, "hi");

    }


    public static void removeAll(ArrayList<String> wordList, String targetWord)
    {
        int count = 0;
        for(String each : wordList)
        {
            if(each.equals(targetWord))
            {
                count++;
            }
        }

        for(int i = 0; i < count; i++)
        {
            wordList.remove(targetWord);
        }
        System.out.println(wordList);
    }
}
