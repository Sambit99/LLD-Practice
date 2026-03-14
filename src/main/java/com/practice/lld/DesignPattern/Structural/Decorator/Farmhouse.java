package com.practice.lld.DesignPattern.Structural.Decorator;

public class Farmhouse implements BasePizza {
    @Override
    public String getDescription() {
        return "Farmhouse Pizza";
    }

    @Override
    public double getCost() {
        return 200;
    }
}
