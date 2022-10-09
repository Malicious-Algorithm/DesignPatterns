package factory.models.franchisePizzaFactory;

import factory.models.NYStylePizzaStore;
import factory.models.Pizza;

public class NYStyleCheesePizza extends Pizza {
    public NYStyleCheesePizza(){
        name = "NY Style Sauce and Cheese Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";

        toppings.add("Grated Reggiano Chesse");
    }
}
