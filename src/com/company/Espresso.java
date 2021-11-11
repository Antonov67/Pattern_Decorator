package com.company;

public class Espresso extends Beverage{
    public Espresso() {
        description = "Espresso";
    }

    @Override
    public double cost() {
        if (size == Size.BIG) return 1.99;
        else if (size == Size.MEDIUM) return 1.59;
        else return 1.09;
    }
}
