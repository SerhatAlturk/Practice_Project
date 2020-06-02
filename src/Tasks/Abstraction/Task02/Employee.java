package Tasks.Abstraction.Task02;

public abstract class Employee
{
    String name, jobTitle;
    int age, salary;
    char gender;

    public Employee(String name, String jobTitle, int age, int salary, char gender)
    {
        this.name = name;
        this.jobTitle = jobTitle;
        this.age = age;
        this.salary = salary;
        this.gender = gender;
    }

    public abstract void work();

    public String toString()
    {
        return "Name: "+name+
               ", Age: "+age+
               ", Gender: "+gender+
               ", Salary: $"+salary+
               ", Job Title: "+jobTitle;
    }
}
