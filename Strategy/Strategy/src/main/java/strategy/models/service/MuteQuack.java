package strategy.models.service;

public class MuteQuack implements QuackBehavior{
    public void quack(){
        System.out.println("<< Silence >>");
    }
}
