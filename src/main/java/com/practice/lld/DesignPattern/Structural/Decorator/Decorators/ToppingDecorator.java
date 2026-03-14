package com.practice.lld.DesignPattern.Structural.Decorator.Decorators;

import com.practice.lld.DesignPattern.Structural.Decorator.BasePizza;

public abstract class ToppingDecorator implements BasePizza {
    BasePizza pizza;

    public ToppingDecorator(BasePizza pizza) {
        this.pizza = pizza;
    }
}
