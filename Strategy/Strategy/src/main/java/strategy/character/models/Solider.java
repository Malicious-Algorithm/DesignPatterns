package strategy.character.models;

import strategy.character.service.GunBehavior;

public class Solider extends Character {
    public Solider(){
        weaponBehavior = new GunBehavior();
    }

    public void display(){
        System.out.println("I'm a Solider!");
    }
}
