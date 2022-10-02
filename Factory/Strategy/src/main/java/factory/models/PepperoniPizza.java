package factory.models;

public class PepperoniPizza extends Pizza{

    public PepperoniPizza(){
        System.out.println("PepperoniPizza");
        this.prepare();
        this.bake();
        this.cut();
        this.box();
    }
}
