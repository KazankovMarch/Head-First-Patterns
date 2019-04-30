package ru.adkazankov.strategy;

public class Quak implements QuakBehavior {
    @Override
    public void quak() {
        System.out.println("Quak!");
    }
}
