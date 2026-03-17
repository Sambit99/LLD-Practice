package com.practice.lld.DesignPattern.Creational.Factory.FactoryMethod;

import com.practice.lld.DesignPattern.Creational.Factory.Circle;
import com.practice.lld.DesignPattern.Creational.Factory.Shape;
import com.practice.lld.DesignPattern.Creational.Factory.ShapeType;


// Step 5: Client code demonstration
public class FactoryMethodDemo {
    public static void main(String[] args) {
        System.out.println("======= Factory Method Design Pattern ======");

        ShapeType shapeType = ShapeType.CIRCLE;
        Shape shape = getShapeInstance(shapeType);

        shape.draw();
        shape.computeArea();
    }

    private static Shape getShapeInstance(ShapeType shapeType) {
        Shape shape = null;
        if(shapeType == null) {
            return null;
        }

        switch (shapeType) {
            case CIRCLE:
                ShapeFactory circleCreator = new CircleCreator();
                shape = circleCreator.createShape();
                break;
            case RECTANGLE:
                ShapeFactory rectangleCreator = new RectangleCreator();
                shape = rectangleCreator.createShape();
                break;
            case SQUARE:
                ShapeFactory squareCreator = new SquareCreator();
                shape = squareCreator.createShape();
                break;
            default:
                new IllegalStateException("ShapeType doesn't exist.");
        }

        return shape;
    }
}
