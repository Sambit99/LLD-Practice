package com.practice.lld.DesignPattern.Creational.Factory.FactoryMethod;

import com.practice.lld.DesignPattern.Creational.Factory.Rectangle;
import com.practice.lld.DesignPattern.Creational.Factory.Shape;

// Step 4: Concrete Creator classes
public class RectangleCreator extends ShapeFactory {
    @Override
    public Shape createShape() {
        return new Rectangle();
    }
}
