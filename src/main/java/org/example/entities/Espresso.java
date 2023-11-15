package org.example.entities;

import lombok.*;

@Data
@Builder
public class Espresso implements CoffeeInterface{

    final private int gramsOfCoffeeNeeded = 10;
    final private int mlOfWaterNeeded = 25;

    @Override
    public void grindCoffee() {
        System.out.println("Grounded " + gramsOfCoffeeNeeded + " grams of coffee for the espresso.");
    }

    @Override
    public void makeCoffee() {
        System.out.println("The espresso was made with " + mlOfWaterNeeded + " milliliters of water.");
    }

    @Override
    public void pourIntoCup() {
        System.out.println("The espresso was poured into a cup.");
    }
}
