package ru.adkazankov.factory;

public class ChicagoPizzaStore extends PizzaStore {

    private PizzaIngredientFactory ingredientFactory
            = new ChicagoPizzaIngredientFactory();


    @Override
    public Pizza createPizza(String item) {

        Pizza pizza = null;

        switch (item){
            case "cheese": {
                pizza = new CheesePizza(ingredientFactory);
                pizza.setName("Chicago Cheese pizze");
                break;
            }
            case "clam": {
                pizza = new ClamPizza(ingredientFactory);
                pizza.setName("Chicago clam pizza");
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
