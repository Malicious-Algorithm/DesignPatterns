package factory;
import factory.models.Pizza;
import factory.models.SimplePizzaFactory;

public class factoryMain {
    public static void main(String[] args) {
/*
        Pizza pizza = new Pizza();
        pizza.orderPizza();
        System.out.println("/---------------------------------------/");
        Pizza typeOfPizza = new Pizza();
        typeOfPizza.orderPizza("pepperoni");
        System.out.println("/---------------------------------------/");
        typeOfPizza.orderPizza("cheese");
        System.out.println("/---------------------------------------/");
        typeOfPizza.orderPizza("greek");
        System.out.println("/---------------------------------------/");
*/
        System.out.println("/-------Using Factory Design Pattern----------/");
        SimplePizzaFactory simplePizzaFactory = new SimplePizzaFactory();
        Pizza pizza = new Pizza(simplePizzaFactory);
        pizza.orderPizza("pepperoni");
        System.out.println("/---------------------------------------/");
        pizza.orderPizza("cheese");
        System.out.println("/---------------------------------------/");
        pizza.orderPizza("greek");
        System.out.println("/---------------------------------------/");
    }
}
