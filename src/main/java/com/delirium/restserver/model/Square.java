package com.delirium.restserver.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Square extends Rectangle {

    public Square() {
        super("Square");
    }

    public Double getSide() {
        return super.getLength();
    }

    public void setSide(Double x) {
        super.setLength(x);
        super.setWidth(x);
    }

    @JsonIgnore
    public Double getLength() {
        return null;
    }

    @JsonIgnore
    public void setLength(Double length) {
        setSide(length);
    }

    @JsonIgnore
    public Double getWidth() {
        return null;
    }

    @JsonIgnore
    public void setWidth(Double width) {
        setSide(width);
    }
}
