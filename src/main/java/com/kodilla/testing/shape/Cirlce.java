package com.kodilla.testing.shape;

public class Cirlce implements Shape {
    private final String NAME = "Circle";
    private final double radius;

    public Cirlce(int radius) {
        this.radius = radius;
    }

    @Override
    public String getShapeName() {
        return NAME;
    }

    @Override
    public double getField() {
        return Math.PI*Math.pow(radius, 2);
    }
}
