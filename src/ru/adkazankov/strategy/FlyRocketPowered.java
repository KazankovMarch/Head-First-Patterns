package ru.adkazankov.strategy;

public class FlyRocketPowered implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("i'm flying by rocket power!");
    }
}
