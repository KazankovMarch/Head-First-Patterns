package ru.adkazankov.strategy;

public class Squeak implements QuakBehavior {
    @Override
    public void quak() {
        System.out.println("Squeak!");
    }
}
