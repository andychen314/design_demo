package com.design.struct.decorator;

/**
 * 鸡腿堡类
 *
 * @author Andy
 * @date 18/6/6
 */
public class ChickenBurger extends Humburger {

    public ChickenBurger() {
        name = "鸡腿堡";
    }

    @Override
    public double getPrice() {
        return 10;
    }
}
