package factory.models.franchisePizzaFactory;

import factory.models.Pizza;

public class ChicagoStyleCheesePizza extends Pizza {
    public ChicagoStyleCheesePizza(){
        name = "Chicago Style Cheese Pizza!";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";

        toppings.add("Shredded Mozzarella Sauce");
    }

    @Override
    public void cut(){
        System.out.println("Cutting the pizza into square slices");
    }
}