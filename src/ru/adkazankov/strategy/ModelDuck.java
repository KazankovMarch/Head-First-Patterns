package ru.adkazankov.strategy;

public class ModelDuck extends Duck{

    public ModelDuck() {

        this.flyBehavior = new FlyNoWay();
        this.quakBehavior =  new Quak();

    }

    @Override
    public void display() {
        System.out.println("i'm a strategy duck");
    }
}
