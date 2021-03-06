package Practice;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Time_Formatting                                                                  //Date: 24 Apr 2020 -- Time: 9:42 AM
{
    public static void main(String[] args)
    {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("hh:mm:ss a");
        LocalTime time1 = LocalTime.of(16, 30);
        System.out.println(time1.format(dtf));
        LocalTime time2 = LocalTime.of(12, 0, 30);
        System.out.println(time2.format(dtf));
        boolean result1 = time1.isAfter(time2);
        System.out.println(result1);
    }


}
