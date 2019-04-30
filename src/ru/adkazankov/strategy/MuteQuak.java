package ru.adkazankov.strategy;

public class MuteQuak implements QuakBehavior {
    @Override
    public void quak() {
        System.out.println("<< silence >>");
    }
}
