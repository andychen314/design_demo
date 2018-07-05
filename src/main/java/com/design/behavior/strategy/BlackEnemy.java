package com.design.behavior.strategy;

/**
 * @author Andy
 * @date 18/6/8
 */
public class BlackEnemy implements IStrategy {
    @Override
    public void operate() {
        System.out.println("孙夫人断后，挡住追兵");
    }
}
