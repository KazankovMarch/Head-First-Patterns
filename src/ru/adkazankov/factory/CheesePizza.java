package ru.adkazankov.factory;

public class CheesePizza extends Pizza {

    PizzaIngredientFactory factory;

    public CheesePizza(PizzaIngredientFactory factory) {
        this.factory = factory;
    }

    @Override
    void prepare() {
        System.out.println("preparing " + getName());
        this.cheese = factory.createCheese();
        this.dough = factory.createDough();
        this.sauce =  factory.createSauce();
    }
}
