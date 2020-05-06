package Replits;

import java.util.ArrayList;

public class Replit187_MethodsWithArrayList8CombineAll                                                                  //Date: 23 Apr 2020 -- Time: 5:24 PM
	{

	public static ArrayList<String> combineAL(ArrayList<String> ArrayList1, ArrayList<String> ArrayList2)
	{
		ArrayList<String> A = new ArrayList<String>(ArrayList1.size() + ArrayList2.size());

		int count = 0;
		for (String a : ArrayList1)
		{
			A.add(count, a);
			count++;
		}
		for (String b : ArrayList2)
		{
			A.add(count, b);
			count++;
		}

		return A;
	}

	public static void main(String[] args)
	{
		ArrayList<String> g1 = new ArrayList<String>(5);
		g1.add("serhat");
		g1.add("serhat");
		g1.add("serhat");
		g1.add("serhat");
		g1.add("serhat");

		ArrayList<String> g2 = new ArrayList<String>(5);
		g2.add("great");
		g2.add("great");
		g2.add("great");
		g2.add("great");
		g2.add("great");

		System.out.println(combineAL(g1, g2));
	}


	}
