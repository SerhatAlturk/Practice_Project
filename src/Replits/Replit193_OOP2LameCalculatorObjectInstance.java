package Replits;      //Created at: 1:43 AM

//May, 06, 2020
public class Replit193_OOP2LameCalculatorObjectInstance
{
    public static void main(String[] args)
    {

        LameCalculator lc = new LameCalculator();
        System.out.println("1+1 = " + lc.plus(1, 1));
        System.out.println("2-3 = " + lc.minus(2, 3));
        System.out.println("2x3 = " + lc.multiply(2, 3));
        System.out.println("10:2 = " + lc.divide(10, 2));


    }

    static class LameCalculator
    {
        public int plus(int a, int b)
        {
            return a + b;
        }

        public int minus(int a, int b)
        {
            return a - b;
        }

        public int multiply(int a, int b)
        {
            return a * b;
        }

        public int divide(int a, int b)
        {
            return a / b;
        }

    }
}
