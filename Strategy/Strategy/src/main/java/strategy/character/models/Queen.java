package strategy.character.models;

import strategy.character.service.BowAndArrowBehavior;

public class Queen extends Character{
    public Queen(){
        weaponBehavior = new BowAndArrowBehavior();
    }

    public void display(){
        System.out.println("I'm a Queen!");
    }
}
