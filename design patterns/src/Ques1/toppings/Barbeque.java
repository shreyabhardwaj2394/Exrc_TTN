package Ques1.toppings;

import Ques1.pizza.Pizza;

public class Barbeque extends PizzaToppings {

    public void setPrice(){setPrice(200);}

    @Override
    public String toString() {
        return "Barbeque price= Rs." + price;
    }
}
