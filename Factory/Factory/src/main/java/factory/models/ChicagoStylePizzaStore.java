package factory.models;

import factory.models.franchisePizzaFactory.*;

public class ChicagoStylePizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        if (type.equals("cheese")){
            return new ChicagoStyleCheesePizza();
        }else if(type.equals("pepperoni")) {
            return new ChicagoStylePepperoniPizza();
        }else if (type.equals("greek")) {
            return new ChicagoStyleGreekPizza();
        }else
            return null;
    }
}
