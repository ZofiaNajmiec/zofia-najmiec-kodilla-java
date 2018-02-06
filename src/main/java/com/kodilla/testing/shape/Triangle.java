package com.kodilla.testing.shape;

public class Triangle implements Shape {
    private final String NAME = "Triangle";
    private final double a, h;

    public Triangle(double a, double h) {
        this.a = a;
        this.h = h;
    }
    @Override
    public String getShapeName() {
        return NAME;
    }

    @Override
    public double getField() {
        return 0.5*a*h;
    }
}
