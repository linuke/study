package com.linuke.pattern.strategy;


/**
 * Created by linuke on 2014��6��9��.
 */
public abstract class Duck {

    FlyBehavior flyBehavior;
    public Duck(){

    }

    public abstract void display();

    public void performFly(){
        flyBehavior.fly();
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
       this.flyBehavior = flyBehavior;
    }
}