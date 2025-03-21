package org.example.Factory_Method.Example1;

public class Main {

    public static void main(String[] args) {
        PizzaStoreFactory cheesePizzaStore = new CheesePizzaStore();

        System.out.println("-------- Cheese Pizza Store --------");
        cheesePizzaStore.orderPizza();
        cheesePizzaStore.createPizza();

        System.out.println("-------- Chicken Pizza Store --------");
        PizzaStoreFactory chickenPizzaStore = new ChickenPizzaStore();
        chickenPizzaStore.orderPizza();
        chickenPizzaStore.createPizza();
    }
}
