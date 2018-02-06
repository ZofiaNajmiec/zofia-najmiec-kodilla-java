package com.kodilla.testing.shape;

public class Square implements Shape {
    private final String NAME = "Square";
    private final double b;

    public Square(double b) {
        this.b = b;
    }
    @Override
    public String getShapeName() {
        return NAME;
    }

    @Override
    public double getField() {
        return Math.pow(b, 2);
    }
}
