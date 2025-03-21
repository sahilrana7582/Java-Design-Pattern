package org.example.Factory_Method.Example1;

public class CheesePizzaStore extends PizzaStoreFactory {
    @Override
    PizzaInterface createPizza() {
        return new CheesePizza();
    }
}
