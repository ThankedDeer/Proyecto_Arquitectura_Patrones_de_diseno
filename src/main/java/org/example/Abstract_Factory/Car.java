package org.example.Abstract_Factory;

public class Car {

    private String model;
    private String color;
    private String engineType;

    public void display() {
        System.out.println("Model: " + model + ", Color: " + color + ", Engine Type: " + engineType);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }
}
