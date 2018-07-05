package com.design.struct.adapter;

/**
 * @author Andy
 * @date 18/6/6
 */
public class ConcreteTarget implements Target{
    @Override
    public void request() {
        System.out.println(" simple function! ");
    }
}
