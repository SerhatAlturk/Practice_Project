package Replits;

import java.util.Scanner;

public class Replit146_Methods8SplitPersonInfo                                                                  //Date: 16 Apr 2020 -- Time: 2:56 PM
{

    public static void main(String[] args)
    {
        Scanner inp = new Scanner(System.in);
        String s = inp.next();
        person(s);
    }

    public static void person(String info)
    {

        //your code here
        String[] arr = info.split(",");

        System.out.println("person name: " + arr[0] + " last name: " + arr[1] + " age: " + arr[2]);
    }//end person
}
