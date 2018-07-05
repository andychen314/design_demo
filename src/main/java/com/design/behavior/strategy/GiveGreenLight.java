package com.design.behavior.strategy;

/**
 * @author Andy
 * @date 18/6/8
 */
public class GiveGreenLight implements IStrategy {
    @Override
    public void operate() {
        System.out.println("求吴国太开个绿灯，放行");
    }
}
