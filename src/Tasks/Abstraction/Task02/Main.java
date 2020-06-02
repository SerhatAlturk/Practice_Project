package Tasks.Abstraction.Task02;

public class Main
{
    public static void main(String[] args)
    {
        Tester tester1 = new Tester("Serhat", "QA Engineer", 21, 120_000, 'M');
        tester1.work();

        Developer developer1 = new Developer("Jack", "Senior Developer", 34, 340_000, 'M');
        developer1.work();
    }
}
