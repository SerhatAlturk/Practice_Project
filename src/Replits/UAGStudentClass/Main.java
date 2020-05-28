package Replits.UAGStudentClass;

public class Main
{
    public static void main(String[] args)
    {

    }
}

class UAGStudent
{
    public static String principalName = "Ms. McKoy";
    public static int nextID = 100;
    public String name;
    public int grade;
    public String studentID;

    public UAGStudent(String name, int grade)
    {
        this.name = name;
        this.grade = grade;
        studentID = this.name.substring(0, 1).toUpperCase() + "" + nextID;
        nextID++;
    }

    public static void newPrincipal(String principalName)
    {
        UAGStudent.principalName = principalName;
    }

    public static void resetID()
    {
        nextID = 100;
    }

    public String toString()
    {
        return name + " " + studentID;
    }
}
