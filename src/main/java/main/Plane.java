package main;

public class Plane extends Vehicle {
    
    public Plane(String manufacturer, String model, int maxSpeed) {
        super(manufacturer, model, maxSpeed);
        this.engine = new Engine("Suihkumoottori", 500);
    }
    
    public void fly() {
        System.out.println(manufacturer + " " + model + " lentää kohteeseen!");
    }
}
