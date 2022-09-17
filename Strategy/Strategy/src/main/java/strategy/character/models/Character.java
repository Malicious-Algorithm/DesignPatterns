package strategy.character.models;

import strategy.character.service.WeaponBehavior;

public abstract class Character {

    WeaponBehavior weaponBehavior;

    public abstract void display();

    public void performFight(){
        weaponBehavior.useWeapon();
    }

    public void setWeaponBehavior(WeaponBehavior wb){
        this.weaponBehavior = wb;
    }

    public void dodge(){
        System.out.println("Dodged attack haha !");
    }

    public void death(){
        System.out.println("aghhh, i died!");
    }

    public void revivied(){
        System.out.println("Wow, i've returned from death!");
    }

    public void attack(){
        System.out.println("Take this!");
    }
}
