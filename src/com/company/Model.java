package com.company;

public class Model extends Car{
    private String model;

    public Model(String color) {
        super(color);
    }

    @Override
    public void print() {
        System.out.println("E60");
    }
}
