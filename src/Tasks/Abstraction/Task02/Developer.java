package Tasks.Abstraction.Task02;

public class Developer extends Employee
{
    public Developer(String name, String jobTitle, int age, int salary, char gender)
    {
        super(name, jobTitle, age, salary, gender);
    }

    @Override
    public void work()
    {
        System.out.println(name+" is working. (Developer)");
    }
}
