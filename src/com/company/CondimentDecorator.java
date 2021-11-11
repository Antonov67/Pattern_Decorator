package com.company;

public abstract class CondimentDecorator extends Beverage{
    public Beverage beverage;
    @Override
    public abstract String getDescription();

    public Size getSize(){
        return beverage.getSize();
    }
}
