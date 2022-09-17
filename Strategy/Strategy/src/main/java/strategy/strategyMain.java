package strategy;

import strategy.character.models.Character;
import strategy.character.models.Queen;
import strategy.character.models.Solider;
import strategy.character.models.Troll;
import strategy.character.service.BowAndArrowBehavior;
import strategy.character.service.GunBehavior;
import strategy.character.service.KnifeBehavior;
import strategy.models.Duck;
import strategy.models.MallardDuck;
import strategy.models.ModelDuck;
import strategy.service.FlyRocketPowered;

public class strategyMain {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.display();
        mallard.performQuack();
        mallard.performFly();
        System.out.println("/**********************/");

        Duck model = new ModelDuck();
        model.display();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();

        System.out.println("/**********************/");
        Character queen = new Queen();
        queen.display();
        queen.performFight();
        queen.setWeaponBehavior(new KnifeBehavior());
        queen.performFight();

        Character solider = new Solider();
        solider.display();
        solider.performFight();
        solider.attack();

        queen.display();
        queen.dodge();
        queen.attack();

        solider.death();

        Character troll = new Troll();
        troll.display();
        troll.performFight();
        troll.setWeaponBehavior(new GunBehavior());
        troll.performFight();
        troll.attack();

        queen.death();
        queen.revivied();
    }
}
