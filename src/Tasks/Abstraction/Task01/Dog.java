package Tasks.Abstraction.Task01;

public class Dog extends Pets
{
    public Dog(String name, String color, String breed, int age, char gender)
    {
        super(name, color, breed, age, gender);
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

    @Override
    public void speak()
    {
        System.out.println(name + " is barking.");
    }
}
