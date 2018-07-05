package com.design.struct.component;

/**
 * @author Andy
 * @date 18/6/7
 */
public abstract class Component {

    String name;

    public abstract void add(Component c);

    public abstract void remove(Component c);

    public abstract void eachChild();

}
