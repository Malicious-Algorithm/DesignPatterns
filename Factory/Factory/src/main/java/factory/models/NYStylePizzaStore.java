package factory.models;

import factory.models.franchisePizzaFactory.NYStyleCheesePizza;
import factory.models.franchisePizzaFactory.NYStyleGreekPizza;
import factory.models.franchisePizzaFactory.NYStylePepperoniPizza;

public class NYStylePizzaStore extends PizzaStore {

    @Override
        public Pizza createPizza(String type) {
        if (type.equals("cheese")){
            return new NYStyleCheesePizza();
        }else if(type.equals("pepperoni")) {
            return new NYStylePepperoniPizza();
        }else if (type.equals("greek")){
            return new NYStyleGreekPizza();
        }else
            return null;
    }
}
