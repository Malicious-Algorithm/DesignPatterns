package strategy;

import strategy.models.Duck;
import strategy.models.MallardDuck;
import strategy.models.ModelDuck;
import strategy.models.service.FlyRocketPowered;

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

    }
}
