package org.example.Factory_Method.Example1;

public class CheesePizza implements PizzaInterface{
    @Override
    public void orderPizza() {
        System.out.println("Ordering a Cheese Pizza");
    }

    @Override
    public void preparePizza() {
        System.out.println("Preparing a Cheese Pizza");

    }

    @Override
    public void bakePizza() {
        System.out.println("Baking a Cheese Pizza");

    }

    @Override
    public void cutPizza() {
        System.out.println("Cutting a Cheese Pizza");

    }
}
