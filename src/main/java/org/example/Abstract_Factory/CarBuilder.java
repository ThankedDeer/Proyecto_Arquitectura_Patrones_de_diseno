package org.example.Abstract_Factory;

public interface CarBuilder {
    void buildModel(String model);
    void buildColor(String color);
    void buildEngineType(String engineType);
    Car getResult();
}
