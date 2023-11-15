package org.example.factory;

import org.example.entities.Americano;
import org.example.entities.Cappuccino;
import org.example.entities.CoffeeInterface;
import org.example.entities.Espresso;
import org.example.enums.CoffeeType;

public class CoffeeFactory {
    static public CoffeeInterface createCoffee(CoffeeType type){
        switch (type){
            case ESPRESSO -> {
                return Espresso.builder().build();
            }
            case AMERICANO -> {
                return Americano.builder().build();
            }
            case CAPPUCCINO -> {
                return Cappuccino.builder().build();
            }
            default -> {
                return null;
            }
        }
    }
}
