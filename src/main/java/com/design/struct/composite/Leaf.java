package com.design.struct.composite;

/**
 * @author Andy
 * @date 18/6/7
 */
public class Leaf extends Component {

    @Override
    public void add(Component c) {

        System.out.println("");

    }

    @Override
    public void remove(Component c) {

        System.out.println("");

    }

    @Override
    public void eachChild() {

        System.out.println(name + "执行了");

    }
}
