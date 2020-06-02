package Tasks.Abstraction.Task01;

public class Main
{
    public static void main(String[] args)
    {
        Dog dog1 = new Dog("Charlie", "White", "German Shepard", 2, 'M');
        dog1.eat();
        dog1.sleep();
        dog1.speak();

        Cat cat1 = new Cat("Maxie", "Gray", "Persian Cat", 4, 'F');
        cat1.eat();
        cat1.sleep();
        cat1.speak();

        Tiger tiger1 = new Tiger("Fluffy", "Orange Striped", "Bengal Tiger", 5, 'M');
        tiger1.eat();
        tiger1.sleep();
        tiger1.speak();
    }
}
