package Tasks.Abstraction;

public abstract class Pets
{
    public String name, color, breed;
    public byte age;
    public char gender;

    public Pets(String name, String color, String breed, byte age, char gender)
    {
        this.name = name;
        this.color = color;
        this.breed = breed;
        this.age = age;
        this.gender = gender;
    }

    public abstract void sleep();

    public abstract void eat();

    public abstract void speak();

    public String toString()
    {
        return "Name: " + name +
               ", Color: " + color +
               ", Breed: " + breed +
               ", Age: " + age +
               ", and Gender: " + gender;
    }
}
