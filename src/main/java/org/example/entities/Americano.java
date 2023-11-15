package org.example.entities;

import lombok.Builder;
import lombok.Data;


@Data
@Builder
public class Americano implements CoffeeInterface{

    final private int gramsOfCoffeeNeeded = 7;
    final private int mlOfWaterNeeded = 30;

    @Override
    public void grindCoffee() {
        System.out.println("Grounded " + gramsOfCoffeeNeeded + " grams of coffee for the americano.");
    }

    @Override
    public void makeCoffee() {
        System.out.println("The americano was made with " + mlOfWaterNeeded + " milliliters of water.");
    }

    @Override
    public void pourIntoCup() {
        System.out.println("The americano was poured into a cup.");
    }
}
