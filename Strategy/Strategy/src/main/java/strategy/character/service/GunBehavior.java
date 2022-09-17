package strategy.character.service;

public class GunBehavior implements WeaponBehavior{
    @Override
    public void useWeapon(){
        System.out.println("I'm using a Gun!");
    }
}
