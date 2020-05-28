package Replits.Assessment6_3PersonClass;

public class Main   //Created at: 1:18 PM - May, 16, 2020
{
    public static void main(String[] args)
    {
        Person person1 = new Person("Serhat", "Alturk", 10, 31, 1998, "12345");
        System.out.println(person1.getFirstname());
        System.out.println(person1.verifySSN("1234"));
    }
}

class Person
{
    private String firstname;
    private String lastname;
    private int birthmonth;
    private int birthday;
    private int birthyear;
    private String ssn;

    public Person(String firstname, String lastname, int birthmonth, int birthday, int birthyear, String ssn)
    {
        this.firstname = firstname;
        this.lastname = lastname;
        this.birthmonth = birthmonth;
        this.birthday = birthday;
        this.birthyear = birthyear;
        this.ssn = ssn;
    }

    public String getFirstname()
    {
        return firstname;
    }

    public void setFirstname(String firstname)
    {
        this.firstname = firstname;
    }

    public String getLastname()
    {
        return lastname;
    }

    public void setLastname(String lastname)
    {
        this.lastname = lastname;
    }

    public String getBirthday()
    {
        return birthmonth + "/" + birthday + "/" + birthyear;
    }

    public boolean verifySSN(String ssn)
    {
        return this.ssn.equals(ssn);
    }
}