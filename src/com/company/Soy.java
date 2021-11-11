package com.company;

public class Soy extends CondimentDecorator {
    Beverage beverage;
    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }
    public double cost() {
        if (beverage.getSize()==Size.BIG) return .20 + beverage.cost();
        else if (beverage.getSize()==Size.MEDIUM) return .15 + beverage.cost();
        else return .10 + beverage.cost();
    }
}
