package com.practice.lld.DesignPattern.Creational.Factory.SimpleFactory;

import com.practice.lld.DesignPattern.Creational.Factory.Shape;
import com.practice.lld.DesignPattern.Creational.Factory.ShapeType;

// Step 3: Simple Factory Demo (Bloated Design)
public class SimpleFactoryDemo {
    public static void main(String[] args) {
        System.out.println("======= Simple Factory Design Pattern ======");

        // set the type you want
        ShapeType shapeType = ShapeType.SQUARE;
        // get the shape
        Shape shape = ShapeFactory.createShape(shapeType);
        shape.draw();
        shape.computeArea();
    }
}
