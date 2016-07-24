package com.delirium.restserver.model;

/**
 * Created by morand3 on 7/24/2016.
 */
public class Rectengale extends Shape {
    private Double length;
    private Double width;

    public Rectengale() {
        super("Rectengale");
    }

    @Override
    public Double area() {
        return length * width;
    }

    public Double getLength() {
        return length;
    }

    public void setLength(Double length) {
        this.length = length;
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }
}
