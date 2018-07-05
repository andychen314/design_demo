package com.design.behavior.watcher;

/**
 * 警察
 *
 * @author Andy
 * @date 18/6/13
 */
public class Police implements Watcher {
    @Override
    public void update() {
        System.out.println("运输车有行动，警察护航");
    }
}
