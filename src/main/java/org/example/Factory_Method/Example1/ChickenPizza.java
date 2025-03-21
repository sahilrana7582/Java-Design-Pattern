package org.example.Factory_Method.Example1;

public class ChickenPizza implements PizzaInterface{
    @Override
    public void orderPizza() {
        System.out.println("Ordering a Chicken Pizza");
    }

    @Override
    public void preparePizza() {
        System.out.println("Preparing a Chicken Pizza");

    }

    @Override
    public void bakePizza() {
        System.out.println("Baking a Chicken Pizza");

    }

    @Override
    public void cutPizza() {
        System.out.println("Cutting a Chicken Pizza");

    }
}
