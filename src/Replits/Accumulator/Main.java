package Replits.Accumulator;

public class Main
{
    public static void main(String[] args)
    {

    }
}

class Accumulator
{
    int sum;

    public Accumulator(int sum)
    {
        this.sum = sum;
    }

    public int getSum()
    {
        return sum;
    }

    public void add(int var)
    {
        sum += var;
    }

    public void remove(int var)
    {
        sum -= var;
    }

    public String toString()
    {
        return "Sum is: " + sum;
    }
}
