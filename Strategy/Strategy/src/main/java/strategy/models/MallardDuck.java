package strategy.models;

import strategy.models.service.FlyWithWings;
import strategy.models.service.Quack;

public class MallardDuck extends Duck{

    public MallardDuck(){
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    public void display(){
        System.out.println("I'm a real Mallard duck!");
    }
}
