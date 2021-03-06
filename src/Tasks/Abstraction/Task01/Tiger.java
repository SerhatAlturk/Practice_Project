package Tasks.Abstraction.Task01;

public class Tiger extends Pets
{
    public Tiger(String name, String color, String breed, int age, char gender)
    {
        super(name, color, breed, age, gender);
    }

    @Override
    public void speak()
    {
        System.out.println(name + " is roaring and growling.");
    }

    @Override
    public void sleep()
    {
        System.out.println(name + " is sleeping.");
    }

    @Override
    public void eat()
    {
        System.out.println(name + " is eating.");
    }
}

