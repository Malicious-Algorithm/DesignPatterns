package factory.models.franchisePizzaFactory;

import factory.models.NYStylePizzaStore;
import factory.models.Pizza;

public class ChicagoStyleGreekPizza extends Pizza {
    public ChicagoStyleGreekPizza(){
        name = "Chicago Style Greek Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";

        toppings.add("Shredded Mozzarella Cheese");
    }

    @Override
    public void cut(){
        System.out.println("Cutting the pizza into square slices");
    }
}