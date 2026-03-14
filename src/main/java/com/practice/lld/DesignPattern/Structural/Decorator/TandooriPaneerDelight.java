package com.practice.lld.DesignPattern.Structural.Decorator;

public class TandooriPaneerDelight implements BasePizza{
    @Override
    public String getDescription() {
        return "Tandoori Paneer Delight Pizza";
    }

    @Override
    public double getCost() {
        return 300;
    }
}
