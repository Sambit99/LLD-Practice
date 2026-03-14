package com.practice.lld.DesignPattern.Structural.Decorator.Decorators;

import com.practice.lld.DesignPattern.Structural.Decorator.BasePizza;

public class VeggiesTopping extends ToppingDecorator {
    public VeggiesTopping(BasePizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + "+ Veggies Topping";
    }

    @Override
    public double getCost() {
        return pizza.getCost() + 50;
    }
}
