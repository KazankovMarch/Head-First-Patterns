package ru.adkazankov.strategy;

public class Main1 {

    public static void main(String[] args) {

        Duck mallardDuck = new MallardDuck();

        testDuck(mallardDuck);

        Duck modelDuck = new ModelDuck();

        testDuck(modelDuck);

        modelDuck.setFlyBehavior(new FlyRocketPowered());

        testDuck(modelDuck);

    }

    private static void testDuck(Duck duck) {
        duck.display();
        duck.performFly();
        duck.performQuak();
    }


}
