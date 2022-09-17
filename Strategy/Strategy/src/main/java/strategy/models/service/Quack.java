package strategy.models.service;

public class Quack implements QuackBehavior{
    public void quack(){
        System.out.println("Quack!");
    }
}
