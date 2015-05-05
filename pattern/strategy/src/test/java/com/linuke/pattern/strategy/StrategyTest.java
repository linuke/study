package com.linuke.pattern.strategy;

import org.junit.Test;

/**
 * Created by linuke on 2014Äê6Äê9ÈÕ.
 * @version 1.2
 */
public class StrategyTest {

    @Test
    public void test(){
        Duck redheadDuck = new RedheadDuck();
        redheadDuck.display();
        redheadDuck.setFlyBehavior(new FlyWithWings());
        redheadDuck.performFly();
    }
    
}
