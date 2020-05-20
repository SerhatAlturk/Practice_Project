package Replits.TV1_Encapsulation04;

public class Main
{
    public static void main(String[] args)
    {
        TV tv = new TV("Samsung");

        tv.turnOn();
      //tv.turnOff();

        tv.setVolumeLevel(6);
        tv.volumeUp();
        System.out.println("TV volume: "+tv.getVolumeLevel());

        tv.setChannel(70);
        tv.channelDown();
        System.out.println("TV channel: "+tv.getChannel());

        tv.setBrand("Apple");
        System.out.println("TV brand: "+tv.getBrand());
    }
}
