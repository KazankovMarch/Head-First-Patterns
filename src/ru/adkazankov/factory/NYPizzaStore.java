package ru.adkazankov.factory;

public class NYPizzaStore extends PizzaStore {

    private PizzaIngredientFactory ingredientFactory
            = new NYPizzaIngredientFactory();


    @Override
    protected Pizza createPizza(String item) {
        Pizza pizza = null;

        switch (item){
            case "cheese": {
                pizza = new CheesePizza(ingredientFactory);
                pizza.setName("NY Cheese pizze");
                break;
            }
            case "clam": {
                pizza = new ClamPizza(ingredientFactory);
                pizza.setName("NY clam pizza");
                break;
            }
            default: {
                System.err.println("Unknow pizza item(");
                break;
            }
        }

        return pizza;
    }
}
