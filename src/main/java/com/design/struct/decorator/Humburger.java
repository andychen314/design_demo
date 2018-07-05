package com.design.struct.decorator;

/**
 * 汉堡基类
 *
 * @author Andy
 * @date 18/6/6
 */
public abstract class Humburger {

    protected String name;

    public String getName() {
        return name;
    }

    public abstract double getPrice();

}
