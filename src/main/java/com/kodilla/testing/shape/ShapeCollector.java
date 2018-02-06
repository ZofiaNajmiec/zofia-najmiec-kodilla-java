package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {
    private final List<Shape> shapes = new ArrayList<>();

    public void addFigure(Shape shape){
        shapes.add(shape);
    }
    public boolean removeFigure(Shape shape){
        return shapes.remove(shape);
    }
    public Shape getFigure(int n){
        return shapes.get(n);
    }
    public void showFigures(){
        for (Shape shape : shapes) {
            System.out.println(shape.getShapeName());
        }
    }

}


