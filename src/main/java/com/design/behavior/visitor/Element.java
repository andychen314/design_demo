package com.design.behavior.visitor;

/**
 * @author Andy
 * @date 18/6/13
 */
public abstract class Element {

    public abstract void accept(IVisitor visitor);
    public abstract void doSomething();

}
