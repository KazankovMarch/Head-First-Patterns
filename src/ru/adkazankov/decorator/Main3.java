package ru.adkazankov.decorator;

public class Main3 {

    public static void main(String[] args) {
        Beverage coffe = new DarkRoast();
        coffe = new Milk(coffe);
        coffe = new Milk(coffe);
        coffe = new Soy(coffe);
        System.out.println(coffe.getDescription()+" $"+coffe.cost());

    }

}
