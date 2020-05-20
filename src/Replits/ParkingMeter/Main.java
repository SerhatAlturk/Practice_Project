package Replits.ParkingMeter;

public class Main
{
    public static void main(String[] args)
    {

    }
}
class ParkingMeter
{
    int timeLeft = 0;
    int maxTime;

    public ParkingMeter(int maxTime)
    {
        this.maxTime=maxTime;
    }

    public boolean add(int var)
    {
        if(var==25&&timeLeft+30<=maxTime)
        {
            timeLeft+=30;
            return true;
        }
        else return false;
    }

    public void tick()
    {
        if(timeLeft>0)
        {
            timeLeft--;
        }
    }

    public boolean isExpired()
    {
        if(timeLeft==0)
        {
            return true;
        }
        else return false;
    }
}