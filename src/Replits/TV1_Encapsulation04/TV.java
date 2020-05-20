package Replits.TV1_Encapsulation04;

public class TV
{
    int channel=1;
    int volumeLevel=1;
    boolean on=false;
    String brand="undefined";

    public TV()  //no args cons
    {
        System.out.println("Creating TV object using no Args- Constructor");
    }

    public TV(String brand) //arg cons
    {
        this.brand=brand;
        System.out.println("Creating TV object using 1 arg - constructor");
    }

    //get set VolumeLevel
    public int getVolumeLevel()
    {
        return volumeLevel;
    }

    public void setVolumeLevel(int volumeLevel)
    {

        if(volumeLevel >= 0&&volumeLevel<=7&&on)
        {
            this.volumeLevel=volumeLevel;
        }

        else
        {
            System.out.println("ERROR: TV is either OFF or invalid Volume level");
        }
    }

    public int getChannel()
    {
        return channel;
    }

    public void setChannel(int channel)
    {
        if(channel>0&&channel<=120&&on)
        {
            this.channel=channel;
        }
        else
        {
            System.out.println("ERROR: TV is either OFF or invalid Channel");
        }
    }

    public String getBrand()
    {
        return brand;
    }

    public void setBrand(String brand)
    {
        this.brand=brand;
    }

    public void channelUp()
    {
        if(channel<120&&on)
        {
            ++channel;
        }
        else
        {
            System.out.println("ERROR: TV is either OFF or invalid Channel");
        }
    }

    public void channelDown()
    {
        if(channel>1&&on)
        {
            --channel;
        }
        else
        {
            System.out.println("ERROR: TV is either OFF or invalid Channel");
        }

    }

    public void volumeUp()
    {
        if(volumeLevel<7&&on)
        {
            ++volumeLevel;
        }
        else
        {
            System.out.println("ERROR: TV is either OFF or invalid Volume level");
        }
    }

    public void volumeDown()
    {
        if(volumeLevel>0&&on)
        {
            --volumeLevel;
        }
        else
        {
            System.out.println("ERROR: TV is either OFF or invalid Volume level");
        }
    }

    public boolean isOn()
    {
        return on;
    }

    public void turnOn()
    {
        if(on)
        {
            System.out.println("TV is already ON");
        }
        else
        {
            on=true;
        }
    }

    public void turnOff()
    {
        if(on)
        {
            on=false;
        }
        else
        {
            System.out.println("TV is already OFF");
        }
    }
}
