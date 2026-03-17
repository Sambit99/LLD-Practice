package com.practice.lld.DesignPattern.Creational.Factory.FactoryMethod;

import com.practice.lld.DesignPattern.Creational.Factory.Shape;
import com.practice.lld.DesignPattern.Creational.Factory.Square;

// Step 4: Concrete Creator classes
public class SquareCreator extends ShapeFactory {
    @Override
    public Shape createShape() {
        return new Square();
    }
}
