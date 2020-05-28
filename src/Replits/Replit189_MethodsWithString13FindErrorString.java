package Replits;

public class Replit189_MethodsWithString13FindErrorString                                                                  //Date: 26 Apr 2020 -- Time: 12:31 AM
{

    public static boolean isError(String line)
    {
        String[] arr = line.split(" ");
        return arr[0].equals("error");
    }

}
