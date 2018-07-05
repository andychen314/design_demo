package com.design.behavior.visitor;

import java.util.List;

/**
 * @author Andy
 * @date 18/6/13
 */
public class Client {
    public static void main(String[] args) {
        List<Element> list = ObjectStruture.getList();
        for (Element e : list) {
            e.accept(new Visitor());
        }
    }
}
