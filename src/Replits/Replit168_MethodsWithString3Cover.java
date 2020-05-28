package Replits;

public class Replit168_MethodsWithString3Cover                                                                  //Date: 26 Apr 2020 -- Time: 10:27 AM
{

    public static void main(String[] args)
    {
        System.out.println(coverString("java methods", "me")); //java [me]thods
    }

    public static String coverString(String main, String coverME)
    {
        if(main.contains(coverME))
        {
            main = main.replaceAll(coverME, ("[" + coverME + "]"));
            return main;
        }
        else
        {
            main = "[" + main + "]";
        }
        return main;
    }

}
