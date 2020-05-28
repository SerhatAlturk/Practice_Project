package Replits;

import java.util.Scanner;

public class Replit76_BuildARoute
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String start = scan.next();
        String end = scan.next();

        if(start.equals("A"))
        {
            if(end.equals("A"))
            {
                System.out.println("A found");
            }
            if(end.equals("B"))
            {
                System.out.println("right: B found");
            }
            if(end.equals("C"))
            {
                System.out.println("right > down: C found");
            }
            if(end.equals("D"))
            {
                System.out.println("right > down > left: D found");
            }
        }
        if(start.equals("B"))
        {
            if(end.equals("B"))
            {
                System.out.println("B found");
            }
            if(end.equals("C"))
            {
                System.out.println("down: C found");
            }
            if(end.equals("D"))
            {
                System.out.println("down > left: D found;");
            }
            if(end.equals("A"))
            {
                System.out.println("down > left > up: A found");
            }
        }
        if(start.equals("C"))
        {
            if(end.equals("C"))
            {
                System.out.println("C found");
            }
            if(end.equals("D"))
            {
                System.out.println("left: D found");
            }
            if(end.equals("A"))
            {
                System.out.println("left > up: A found");
            }
            if(end.equals("B"))
            {
                System.out.println("left > up > right: B found");
            }
        }
        if(start.equals("D"))
        {
            if(end.equals("D"))
            {
                System.out.println("D found");
            }
            if(end.equals("A"))
            {
                System.out.println("up: A found");
            }
            if(end.equals("B"))
            {
                System.out.println("up > right: B found");
            }
            if(end.equals("C"))
            {
                System.out.println("up > right > down: C found");
            }
        }





			/*
			Write a program that will print out route instructions.
			Your program should take 2 parameters: start point and end point. Use left, right, up and down for navigation.
			Insert ">" between commands.
			If start point equals to end point - display: "start/end(start or end variable!) found".
			Note: you may move only clock wise.

			Example:
			Input: A
			Input: D
			Output: right > down > left: D found

			Input: C
			Input: C
			Output: C found



			 */
    }
}
