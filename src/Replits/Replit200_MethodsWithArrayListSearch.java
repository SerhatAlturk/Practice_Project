package Replits;

import java.util.ArrayList;

public class Replit200_MethodsWithArrayListSearch                                                                  //Date: 05 May 2020 -- Time: 7:37 PM
{
    public static String search(ArrayList<String> r, String find)
    {
        String result = "";
        int define = 0;
        for(String a : r)
        {
            if(a.contains(find))
            {
                result = a;
                define--;
            }
            define++;
        }
        if(define == r.size())
        {
            result = "search failed";
        }

        return result;
    }//end wineSeller

    public static void main(String[] args)
    {

        ArrayList<String> arr = new ArrayList<String>();
        arr.add("2");
        arr.add("6");
        arr.add("foo bar");
        arr.add("abc");


        String find_tst = search(arr, "foo");
        System.out.print(find_tst);//foo bar


    }//end main
}
