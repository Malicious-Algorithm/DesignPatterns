package factory;
import factory.models.ChicagoStylePizzaStore;
import factory.models.NYStylePizzaStore;
import factory.models.Pizza;
import factory.models.PizzaStore;

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

        System.out.println("/-------Using Factory Design Pattern----------/");
        SimplePizzaFactory simplePizzaFactory = new SimplePizzaFactory();
        Pizza pizza = new Pizza(simplePizzaFactory); //make Pizza class not abstract so you can see its usage here
        pizza.orderPizza("pepperoni");
        System.out.println("/---------------------------------------/");
        pizza.orderPizza("cheese");
        System.out.println("/---------------------------------------/");
        pizza.orderPizza("greek");
        System.out.println("/---------------------------------------/");
*/
        PizzaStore nyPizzaStore = new NYStylePizzaStore();
        PizzaStore chicagoStore = new ChicagoStylePizzaStore();

        Pizza NYpizza = nyPizzaStore.orderPizza("cheese");
        System.out.println("Malicious ordered a " + NYpizza.getName() + "\n");

        Pizza CHpizza = chicagoStore.orderPizza("greek");
        System.out.println("Malicious ordered a " + CHpizza.getName() + "\n");
    }
}
