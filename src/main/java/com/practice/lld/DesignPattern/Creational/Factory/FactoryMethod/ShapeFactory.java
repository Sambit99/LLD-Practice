package com.practice.lld.DesignPattern.Creational.Factory.FactoryMethod;

import com.practice.lld.DesignPattern.Creational.Factory.Shape;

// Step 3: Abstract Creator class
public abstract class ShapeFactory {
    public abstract Shape createShape();
}
