package factory.models;

public class GreekPizza extends Pizza {
    public GreekPizza(){
        System.out.println("GreekPizza");
        this.prepare();
        this.bake();
        this.cut();
        this.box();
    }
}