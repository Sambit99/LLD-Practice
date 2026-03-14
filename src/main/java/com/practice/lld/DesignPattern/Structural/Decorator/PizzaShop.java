package com.practice.lld.DesignPattern.Structural.Decorator;

import com.practice.lld.DesignPattern.Structural.Decorator.Decorators.ExtraCheeseTopping;
import com.practice.lld.DesignPattern.Structural.Decorator.Decorators.MushroomTopping;

public class PizzaShop {
    public static void main(String[] args) {
        System.out.println("======= Decorator Design Pattern ======");
        // Create a plain pizza

        BasePizza pizza1 = new PlainPizza();
        System.out.println("Pizza: " + pizza1.getDescription());
        System.out.println("Pizza: " + pizza1.getCost());

        BasePizza pizza2 = new ExtraCheeseTopping(new PlainPizza());
        System.out.println("Pizza: " + pizza2.getDescription());
        System.out.println("Pizza: " + pizza2.getCost());

        BasePizza pizza3 = new MushroomTopping(new ExtraCheeseTopping(new TandooriPaneerDelight()));
        System.out.println("Pizza: " + pizza3.getDescription());
        System.out.println("Pizza: " + pizza3.getCost());

        BasePizza pizza4 = new MushroomTopping(new ExtraCheeseTopping(new Farmhouse()));
        System.out.println("Pizza: " + pizza4.getDescription());
        System.out.println("Pizza: " + pizza4.getCost());
    }
}