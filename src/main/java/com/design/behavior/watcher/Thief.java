package com.design.behavior.watcher;

/**
 * 强盗
 * @author Andy
 * @date 18/6/13
 */
public class Thief implements Watcher {
    @Override
    public void update() {
        System.out.println("运输车有行动，强盗准备动手");
    }
}
