package com.design.behavior.watcher;

/**
 * 保镖
 *
 * @author Andy
 * @date 18/6/13
 */
public class Security implements Watcher {
    @Override
    public void update() {
        System.out.println("运输车有行动，保安贴身保护");
    }
}
