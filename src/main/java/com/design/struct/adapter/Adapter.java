package com.design.struct.adapter;

/**
 * @author Andy
 * @date 18/6/6
 */
public class Adapter extends Adaptee implements Target {

    public void request() {
        super.specificRequest();
    }

}
