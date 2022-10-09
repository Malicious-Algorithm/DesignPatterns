package factory.models;

import java.util.ArrayList;

public abstract class Pizza {

    public String name;
    public String dough;
    public String sauce;
    public ArrayList<String> toppings = new ArrayList<String>();

    void prepare(){
        System.out.println("Preparing " + name);
        System.out.println("Tossing dough " + dough);
        System.out.println("Adding sauce " + sauce);
        System.out.println("Adding toppings " );
        for (String topping : toppings){
            System.out.println(" " + topping);
        }
    }

    public void bake(){
        System.out.println("Baking pizza for 25 mins");
    }

    public void cut(){
        System.out.println("Cutting pizza into diagonal slices");
    }

    public void box(){
        System.out.println("Putting the pizza in a official PizzaStore box");
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                ", dough='" + dough + '\'' +
                ", sauce='" + sauce + '\'' +
                ", toppings=" + toppings +
                '}';
    }
}
