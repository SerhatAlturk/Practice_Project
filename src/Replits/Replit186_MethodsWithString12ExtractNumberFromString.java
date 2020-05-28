package Replits;

public class Replit186_MethodsWithString12ExtractNumberFromString                                                                  //Date: 23 Apr 2020 -- Time: 3:08 PM
{
    public static String extractNum(String s)
    {
        char[] arr = s.toCharArray();
        String a = "";

        for(char c : arr)
        {
            if(Character.isDigit(c))
            {
                a = a + c;
            }

        }
        return a;


    }

    public static void main(String[] args)
    {
        String g = "aaa2f4gh5";
        System.out.println(extractNum(g));

    }

}
