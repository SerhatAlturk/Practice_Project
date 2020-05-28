package Replits;

import java.util.Scanner;

/*
Instructions from your teacher:
 For you to do:

Given a string variable "word", do the following tests

If the word ends in "y", print "-ies"
If the word ends in "ey", print "-eys"
If the word ends in "ife", print "-ives"
If none of the above is true, print "-s"
No more than one should be printed.
 */
public class ConditionalStatement   //Created at: 10:33 PM - May, 07, 2020
{
    public static void main(String[] args)
    {
        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String word = inp.nextLine();
        //DO NOT CHANGE ABOVE CODE!  Write your code below

        if(word.endsWith("y"))
        {
            System.out.println("-ies");
        }
        else if(word.endsWith("ey"))
        {
            System.out.println("-eys");
        }
        else if(word.endsWith("ife"))
        {
            System.out.println("-ives");
        }
        else
        {
            System.out.println("s");
        }

		/*int last=word.length()-1;
		String last2=word.charAt(last-1)+""+word.charAt(last);
		String last3=word.charAt(last-2)+""+word.charAt(last-1)+""+word.charAt(last);
		char lastLetter=word.charAt(last);

		if(lastLetter=='y')
		{
			if(last2.equals("ey"))
			{
				System.out.println("-eys");
			}
			else
			{
				System.out.println("-ies");
			}
		}
		else if(last3.equals("ife"))
		{
			System.out.println("-ives");
		}
		else
		{
			System.out.println("-s");
		}

*/
    }
}
