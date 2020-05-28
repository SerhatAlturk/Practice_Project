package Replits.GasTank;

public class Main
{
    public static void main(String[] args)
    {

    }
}

class GasTank
{
    //WRITE YOUR CODE HERE
    double amount = 0;
    double capacity;

    public GasTank(double capacity)
    {
        this.capacity = capacity;
    }

    public void addGas(double var)
    {
        if(amount + var > capacity)
        {
            amount = capacity;
        }
        else amount += var;
    }

    public void useGas(double var)
    {
        if(amount - var < 0)
        {
            amount = 0;
        }
        else amount -= var;
    }

    public boolean isEmpty()
    {
        if(amount < 0.1)
        {
            return true;
        }
        else return false;
    }

    public boolean isFull()
    {
        if(amount > capacity - 0.1)
        {
            return true;
        }
        else return false;
    }

    public double getGasLevel()
    {
        return amount;
    }

    public double fillUp()
    {
        double temp = amount;
        amount = capacity;
        return capacity - temp;
    }
}