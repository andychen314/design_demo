package com.design.struct.decorator;

/**
 * @author Andy
 * @date 18/6/6
 */
public class Lettuce extends Condiment {

    Humburger humburger;

    public Lettuce(Humburger humburger) {
        this.humburger = humburger;
    }

    @Override
    public String getName() {
        return humburger.name + " add Lettuce";
    }

    @Override
    public double getPrice() {
        return humburger.getPrice() + 1.5;
    }
}
