package Replits;

import java.util.Arrays;

public class Replit195_MethodsWithString15Anagram                                                                  //Date: 26 Apr 2020 -- Time: 12:42 AM
{

    public static boolean isAnagram(String word1, String word2)
    {
        word1 = word1.toLowerCase().trim();
        word2 = word2.toLowerCase().trim();

        char[] arr1 = word1.toCharArray();
        char[] arr2 = word2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        String c = Arrays.toString(arr1);
        String d = Arrays.toString(arr2);

        return c.equals(d);
    }

    public static void main(String[] args)
    {
        String a = "Listen";
        String b = "Silent";

        System.out.println(isAnagram(a, b));
    }

}
