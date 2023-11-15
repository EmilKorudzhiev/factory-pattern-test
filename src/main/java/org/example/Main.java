package org.example;

import org.example.entities.CoffeeInterface;
import org.example.enums.CoffeeType;
import org.example.factory.CoffeeFactory;

public class Main {
    public static void main(String[] args) {

        CoffeeInterface coffee1 = CoffeeFactory.createCoffee(CoffeeType.AMERICANO);
        coffee1.grindCoffee();
        coffee1.makeCoffee();
        coffee1.pourIntoCup();

        CoffeeInterface coffee2 = CoffeeFactory.createCoffee(CoffeeType.CAPPUCCINO);
        coffee2.grindCoffee();
        coffee2.makeCoffee();
        coffee2.pourIntoCup();

    }
}