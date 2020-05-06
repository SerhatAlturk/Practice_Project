package Practice;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTime_Formatting                                                                  //Date: 24 Apr 2020 -- Time: 10:37 AM
	{
	public static void main(String[] args)
	{
		LocalDateTime datetime1 = LocalDateTime.of(2015, 12, 25, 11, 30, 45);
		System.out.println(datetime1);

		//Tue, 12/25/2015 11:30 AM

		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("E, MMM dd, yy hh:mm a");
		System.out.println(datetime1.format(dtf));
		LocalDateTime now = LocalDateTime.now();
		System.out.println(now.format(dtf));
	}
	}
