package com.design.behavior.visitor;

/**
 * @author Andy
 * @date 18/6/13
 */
public class Visitor implements IVisitor {

    @Override
    public void visit(Element element) {
        element.doSomething();
    }
}
