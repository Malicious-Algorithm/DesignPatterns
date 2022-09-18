package org.example;

import org.example.service.*;

import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        Beverage espresso = new Espresso();
        System.out.println(espresso.getDescription() + " $" + espresso.cost());

        Beverage houseBlend = new HouseBlend();
        //add Soy, 2 hits of Mocca and Whip to the houseBlend beverage!
        houseBlend = new Soy(houseBlend);
        houseBlend = new Mocca(houseBlend);
        houseBlend = new Mocca(houseBlend);
        houseBlend = new Whip(houseBlend);

        DecimalFormat df = new DecimalFormat("#0.00"); //hmm
        System.out.println(houseBlend.getDescription() + " $" + df.format(houseBlend.cost()));

        //for the Decaf could you add only Soy to it?
        Beverage decaf = new Decaf();
        decaf = new Soy(decaf);

        System.out.println(decaf.getDescription() + " $" + decaf.cost());

        //Great, thank you !
    }
}