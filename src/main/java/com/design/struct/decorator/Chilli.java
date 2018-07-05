package com.design.struct.decorator;

/**
 * @author Andy
 * @date 18/6/6
 */
public class Chilli extends Condiment {

    Humburger humburger;

    public Chilli(Humburger humburger){
        this.humburger = humburger;

    }

    @Override
    public String getName() {
        return humburger.getName()+" add Chilli";
    }

    @Override
    public double getPrice() {
        return humburger.getPrice();
    }
}
