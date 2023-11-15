package org.example.entities;

import lombok.Builder;
import lombok.Data;


@Data
@Builder
public class Cappuccino implements CoffeeInterface{

    final private int gramsOfCoffeeNeeded = 5;
    final private int mlOfWaterNeeded = 50;

    @Override
    public void grindCoffee() {
        System.out.println("Grounded " + gramsOfCoffeeNeeded + " grams of coffee for the cappuccino.");
    }

    @Override
    public void makeCoffee() {
        System.out.println("The cappuccino was made with " + mlOfWaterNeeded + " milliliters of water.");
    }

    @Override
    public void pourIntoCup() {
        System.out.println("The cappuccino was poured into a cup.");
    }
}
