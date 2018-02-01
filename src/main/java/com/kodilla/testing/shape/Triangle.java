package com.kodilla.testing.shape;

public class Triangle implements Shape {
    private final double a, h;

    public Triangle(double a, double h) {
        this.a = a;
        this.h = h;
    }


    @Override
    public String getShapeName() {

    }

    @Override
    public double getField() {
        return 0.5*a*h;
    }
}
