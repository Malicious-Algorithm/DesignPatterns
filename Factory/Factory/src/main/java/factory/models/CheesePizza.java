package factory.models;

public class CheesePizza extends Pizza{
    public CheesePizza(){
        System.out.println("CheesePizza");
        this.prepare();
        this.bake();
        this.cut();
        this.box();
    }
}
