package org.example.Abstract_Factory;

public class Main {
    public static void main(String[] args) {
        CarBuilder builder = new SimpleCarBuilder();
        CarManufacturer manufacturer = new CarManufacturer();

        manufacturer.construct(builder);
        Car car = builder.getResult();

        car.display();

    }
}
