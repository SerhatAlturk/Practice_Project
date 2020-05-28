package Replits.CarClass;

public class Car
{
    public String make, model;
    public int numberOfDoors, topSpeed, price;

    public Car(String make, String model, int numberOfDoors, int topSpeed, int price)
    {
        this.make = make;
        this.model = model;
        this.numberOfDoors = numberOfDoors;
        this.topSpeed = topSpeed;
        this.price = price;
    }

    public Car(String make, String model, int topSpeed, int price)
    {
        this.make = make;
        this.model = model;
        numberOfDoors = 4;
        this.topSpeed = topSpeed;
        this.price = price;
    }

    public Car(int numberOfDoors, int topSpeed, int price)
    {
        make = "unknown";
        model = "unknown";
        this.numberOfDoors = numberOfDoors;
        this.topSpeed = topSpeed;
        this.price = price;
    }

    public Car(String make, String model, int numberOfDoors)
    {
        this.make = make;
        this.model = model;
        this.numberOfDoors = numberOfDoors;
        topSpeed = 90;
        price = 0;
    }
}
