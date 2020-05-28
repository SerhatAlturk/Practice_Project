package Replits;

import java.util.Arrays;

/*
Instructions from your teacher:
Complete the combineNames method to return a new String array that is composed of the first name
and last name of each of the parameters.

This may be confusing so look at the example:
first_names = {"bob","joe"}
last_names = {"jones","smith"}

returns a new String array with {"bob jones", "joe smith"}
 */
public class CombineToFullName   //Created at: 10:56 PM - May, 07, 2020
{
    public static String[] combineNames(String[] first_names, String[] last_names)
    {
        String[] Fullname = new String[first_names.length];
        String temp = "";
        for(int i = 0; i < Fullname.length; i++)
        {
            temp = first_names[i] + " " + last_names[i];
            Fullname[i] = temp;
            temp = "";
        }
        return Fullname;
    }

    public static void main(String[] args)
    {
        //feel free to test code here
        String[] first_names = {"bob", "joe"};
        String[] last_names = {"jones", "smith"};
        String[] full = combineNames(first_names, last_names);
        System.out.println(Arrays.toString(full));
    }
}
