package main;

public class Vehicle {
    protected String type;
    protected String manufacturer;
    protected String model;
    protected int maxSpeed;
    Engine engine;

    public Vehicle(String manufacturer, String model, int maxSpeed) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.maxSpeed = maxSpeed;
    }

    public void printSpecs() {
        System.out.println("Kulkuneuvo: " + manufacturer + " " + model);
        System.out.println("Moottori: " + engine.name + " " + engine.power + "kW");
        System.out.println("Huippunopeus: " + maxSpeed + "km/h\n");
    }

}
