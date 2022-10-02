package factory.models;

public class Pizza {

    public Pizza orderPizza(){
        Pizza pizza = new Pizza();

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    public Pizza orderPizza(String type) {
        Pizza pizza = new Pizza();

        if (type.equals("cheese")) {
            pizza = new CheesePizza();
        } else if (type.equals("greek")) {
            pizza = new GreekPizza();
        } else if (type.equals("pepperoni")) {
            pizza = new PepperoniPizza();
        }
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
