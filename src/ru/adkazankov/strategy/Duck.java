package ru.adkazankov.strategy;

public abstract class Duck {

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuakBehavior(QuakBehavior quakBehavior) {
        this.quakBehavior = quakBehavior;
    }

    protected FlyBehavior flyBehavior;
    protected QuakBehavior quakBehavior;

    public Duck(){

    }

    public abstract void display();

    public void performFly(){
        flyBehavior.fly();
    }

    public void performQuak(){
        quakBehavior.quak();
    }

    public void swim(){
        System.out.println("swim");
    }

}
