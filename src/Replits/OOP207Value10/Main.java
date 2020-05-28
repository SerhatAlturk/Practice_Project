package Replits.OOP207Value10;

public class Main
{
    public static void main(String[] args)
    {

    }
}

class Value
{
    private int val = 0;
    private boolean wasModified = false;
    //WRITE YOUR CODE HERE

    public Value(int val)
    {
        this.val = val;
    }

    public Value()
    {
    }

    public boolean wasModified()
    {
        return wasModified;
    }

    public int getVal()
    {
        return val;
    }

    public void setVal(int val)
    {
        this.val = val;
        wasModified = true;
    }


}