package Replits.ClassObjectPlayListEntry;

/*
Write the definition of a class PlayListEntry containing:
An instance variable title of type String, initialized to the empty String.
An instance variable artist of type String, initialized to the empty String.
An instance variable playCount of type int, initialized to 0.

In addition, your PlayList class definition should provide an appropriately
named "get" method and "set" method for each of these.
No constructor need be defined.
 */
public class Main   //Created at: 9:12 PM - May, 07, 2020
{
	public static void main(String[] args)
	{
		PlayListEntry song1=new PlayListEntry();
		song1.setTitle("6 Feet");
		song1.setArtist("Scxrlord");
		song1.setPlayCount(1);

		System.out.println(song1);
	}
}
