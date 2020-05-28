package Replits;

public class Replit166_MethodsWithString1MergeThem                                                                  //Date: 18 Apr 2020 -- Time: 12:09 PM
{

    public static String mergeStrings(String one, String two)
    {
        String a = "";

        if(one.length() > two.length())
        {
            for(int i = 0; i < one.length(); i++)
            {
                if(i < two.length())
                {
                    a = a + "" + one.charAt(i) + two.charAt(i);
                }
                else
                {
                    a = a + "" + one.charAt(i);
                }
            }

        }

        else
        {
            for(int j = 0; j < two.length(); j++)
            {
                if(j < one.length())
                {
                    a = a + "" + one.charAt(j) + two.charAt(j);
                }
                else
                {
                    a = a + "" + two.charAt(j);
                }
            }
        }
        return a;
    }

    public static void main(String[] args)
    {
        String g = "hellooopppp";
        String h = "hallaaa";
        System.out.println(mergeStrings(g, h));
    }

}
