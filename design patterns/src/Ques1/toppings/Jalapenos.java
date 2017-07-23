package Ques1.toppings;

import Ques1.pizza.Pizza;


public class Jalapenos extends PizzaToppings {

    public void setPrice(){setPrice(50);}

    @Override
    public String toString() {
        return "Jalapenos price= Rs." + price;
    }
}
