package org.example.service;

public class Whip extends CondimentDecorator{
    Beverage beverage;

    public Whip(Beverage bg){
        this.beverage = bg;
    }

    public String getDescription(){
        return beverage.getDescription() + ", Whip";
    }

    public double cost(){
        return .30 + beverage.cost();
    }
}
