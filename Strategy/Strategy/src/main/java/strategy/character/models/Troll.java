package strategy.character.models;

import strategy.character.service.AxeBehavior;

public class Troll extends Character{
    public Troll(){
        weaponBehavior = new AxeBehavior();
    }

    public void display(){
        System.out.println("I'm a Troll!");
    }
}
