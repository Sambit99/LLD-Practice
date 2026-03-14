package com.practice.lld.DesignPattern.Structural.Decorator.Decorators;

import com.practice.lld.DesignPattern.Structural.Decorator.BasePizza;

public class ExtraCheeseTopping extends ToppingDecorator{
    public ExtraCheeseTopping(BasePizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " + Extra Cheese Topping";
    }

    @Override
    public double getCost() {
        return pizza.getCost() + 10;
    }
}
