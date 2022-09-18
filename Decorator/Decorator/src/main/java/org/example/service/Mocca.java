package org.example.service;

public class Mocca extends CondimentDecorator{
    Beverage beverage;

    public Mocca(Beverage bg){
        this.beverage = bg;
    }

    public String getDescription(){
        return beverage.getDescription() + ", Mocca";
    }

    public double cost(){
        return 0.20 + beverage.cost();
    }
}
