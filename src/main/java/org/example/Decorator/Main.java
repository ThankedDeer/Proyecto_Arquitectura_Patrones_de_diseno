package org.example.Decorator;

public class Main {
    public static void main(String[] args) {
        // Crear una bebida de café simple
        Coffee simpleCoffee = new SimpleCoffee();
        System.out.println("Simple Coffee - Cost: $" + simpleCoffee.getCost());

        // Decorar la bebida de café con leche y azúcar
        Coffee milkAndSugarCoffee = new MilkDecorator(new SugarDecorator(simpleCoffee));
        System.out.println("Coffee with Milk and Sugar - Description: " + milkAndSugarCoffee.getDescription() +
                ", Cost: $" + milkAndSugarCoffee.getCost());
    }
}
