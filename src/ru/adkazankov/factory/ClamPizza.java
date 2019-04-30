package ru.adkazankov.factory;

public class ClamPizza extends Pizza {
    private PizzaIngredientFactory factory;

    public ClamPizza(PizzaIngredientFactory factory) {
        this.factory = factory;
    }

    @Override
    void prepare() {
        this.dough = factory.createDough();
        this.sauce = factory.createSauce();
        this.cheese = factory.createCheese();
        this.clams = factory.createClams();
    }
}
