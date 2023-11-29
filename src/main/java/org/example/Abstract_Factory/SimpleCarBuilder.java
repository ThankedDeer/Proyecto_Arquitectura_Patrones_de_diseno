package org.example.Abstract_Factory;

public class SimpleCarBuilder implements CarBuilder{
    private Car car = new Car();

    @Override
    public void buildModel(String model) {
        car.setModel(model);
    }

    @Override
    public void buildColor(String color) {
        car.setColor(color);
    }

    @Override
    public void buildEngineType(String engineType) {
        car.setEngineType(engineType);
    }

    @Override
    public Car getResult() {
        return car;
    }
}
