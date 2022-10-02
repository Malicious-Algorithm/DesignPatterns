package factory.models;

public class Pizza {
    SimplePizzaFactory factory;

    public Pizza(){}

    public Pizza(SimplePizzaFactory factory){
        this.factory = factory;
    }

    public Pizza orderPizza() {
        Pizza pizza = new Pizza();
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    public Pizza orderPizza(String type) {
        Pizza pizza;
        pizza = factory.createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    void prepare(){
        System.out.println("preparing pizza");
    }

    void bake(){
        System.out.println("baking pizza");
    }

    void cut(){
        System.out.println("cutting pizza into peaces");
    }

    void box(){
        System.out.println("putting the pizza in a box");
    }
}
