package com.design.behavior.visitor;

/**
 * @author Andy
 * @date 18/6/13
 */
public class FirstElement extends Element{

    @Override
    public void doSomething(){
        System.out.println("这是元素1");
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
