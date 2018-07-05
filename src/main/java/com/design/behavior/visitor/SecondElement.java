package com.design.behavior.visitor;

/**
 * @author Andy
 * @date 18/6/13
 */
public class SecondElement extends Element{

    @Override
    public void doSomething(){
        System.out.println("这是元素2");
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
