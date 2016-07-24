package com.delirium.restserver.model;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME)
@JsonSubTypes(value = {@JsonSubTypes.Type(Rectengale.class), @JsonSubTypes.Type(Circle.class)})
public abstract class Shape {
    private Long id;
    private String name;

    public Shape(String name) {
        this.name = name;
    }

    public Shape() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract Double area();

}
