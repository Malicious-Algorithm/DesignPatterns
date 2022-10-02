package factory;
import factory.models.Pizza;

public class factoryMain {
    public static void main(String[] args) {
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
    }
}
