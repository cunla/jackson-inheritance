package com.delirium.restserver.model;

/**
 * Created by morand3 on 7/24/2016.
 */
public class Circle extends Shape {
    private Double radius;

    public Circle() {
        super("Circle");
    }

    @Override
    public Double area() {
        return 3.14 * radius * radius;
    }

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }
}
