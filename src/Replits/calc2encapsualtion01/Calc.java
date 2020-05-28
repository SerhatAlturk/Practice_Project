package Replits.calc2encapsualtion01;

public class Calc   //Created at: 11:16 PM - May, 18, 2020
{
    private int x, y, result;

    public int getResult()
    {
        return result;
    }

    public void setY(int y)
    {
        this.y = y;
    }

    public void setX(int x)
    {
        this.x = x;
    }

    public void plus()
    {
        result = x + y;
    }

    public void minus()
    {
        result = x - y;
    }
}
