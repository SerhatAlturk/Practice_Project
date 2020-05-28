package Replits.Inheritance1;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Hello World!");
    }
}

class SavingsAccount extends BankAccount
{
    public double interestRate;

    public SavingsAccount(double interestRate)
    {
        this.interestRate = interestRate;
    }

    public double getInterestRate()
    {
        return interestRate;
    }

}

class BankAccount
{
    // you dont need to make any changes in this class
}