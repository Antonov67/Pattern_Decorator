package com.company;

public abstract class Beverage {
    String description = "Unknown Beverage";
    public enum Size {BIG, MEDIUM, SMALL}
    Size size = Size.BIG;

    public String getDescription() {
        return description;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public abstract double cost();
}
