package org.example.Abstract_Factory;

public class CarManufacturer {
    public void construct(CarBuilder builder) {
        builder.buildModel("Sedan");
        builder.buildColor("Blue");
        builder.buildEngineType("Gasoline");
    }
}
