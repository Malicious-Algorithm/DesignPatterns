package factory.models.franchisePizzaFactory;

import factory.models.NYStylePizzaStore;
import factory.models.Pizza;

public class NYStyleGreekPizza extends Pizza {
    public NYStyleGreekPizza(){
        name = "NY Style Greek Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";

        toppings.add("Grated Reggiano Cheese");
        toppings.add("Garlic");
        toppings.add("Onion");
        toppings.add("Mushrooms");
        toppings.add("Red Pepper");
    }
}