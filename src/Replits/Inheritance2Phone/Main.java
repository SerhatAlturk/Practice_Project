package Replits.Inheritance2Phone;

public class Main
{
    public static void main(String[] args)
    {

    }
}

class CameraPhone
{
    int imageSize, memorySize;

    public CameraPhone(int imageSize, int memorySize)
    {
        this.imageSize = imageSize;
        this.memorySize = memorySize;
    }

    public int numPictures()
    {
        return memorySize*1000/imageSize;
    }
}