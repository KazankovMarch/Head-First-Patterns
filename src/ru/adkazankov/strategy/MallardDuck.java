package ru.adkazankov.strategy;

public class MallardDuck extends Duck {

    public MallardDuck() {
        flyBehavior = new FlyWithWings();
        quakBehavior =  new Quak();
    }

    @Override
    public void display() {
        System.out.println("I'm a real mallard duck");
    }
}
