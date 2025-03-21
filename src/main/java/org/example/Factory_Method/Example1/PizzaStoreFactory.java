package org.example.Factory_Method.Example1;

public abstract class PizzaStoreFactory {

    abstract PizzaInterface createPizza();

    public void orderPizza() {
        PizzaInterface pizza = createPizza();
        pizza.orderPizza();
        pizza.preparePizza();
        pizza.bakePizza();
        pizza.cutPizza();
    }

}
