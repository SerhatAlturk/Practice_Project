package Practice;

import java.time.LocalTime;

public class Time                                                                  //Date: 23 Apr 2020 -- Time: 1:53 PM
	{   //year: yy, yyyy, | month: MM, MMM, MMMM | day:dd | days name: E, EEEE
	//hours: hh | minutes: mm | AM or PM: a
	public static void main(String[] args)
	{
		LocalTime time1 = LocalTime.now();
		System.out.println(time1);
		LocalTime time2 = LocalTime.of(23, 50, 30);
		System.out.println(time2);

	}
	}
