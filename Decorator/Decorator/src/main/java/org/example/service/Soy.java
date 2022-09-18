package org.example.service;

public class Soy extends CondimentDecorator{
    Beverage beverage;

    public Soy(Beverage bg){
        this.beverage = bg;
    }

    public String getDescription(){
        return beverage.getDescription() + ", Soy";
    }

    public double cost(){
        return .50 + beverage.cost();
    }
}
