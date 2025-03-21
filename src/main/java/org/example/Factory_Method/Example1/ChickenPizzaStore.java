package org.example.Factory_Method.Example1;

public class ChickenPizzaStore extends PizzaStoreFactory{
    @Override
    PizzaInterface createPizza() {
        return new ChickenPizza();
    }
}
