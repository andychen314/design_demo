package com.design.struct.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Andy
 * @date 18/6/7
 */
public class Composite extends Component {

    List<Component> list = new ArrayList<>();


    @Override
    public void add(Component c) {

        list.add(c);

    }

    @Override
    public void remove(Component c) {

        list.remove(c);

    }

    @Override
    public void eachChild() {

        System.out.println(name + "执行了");
        for (Component c : list) {
            c.eachChild();
        }
    }
}
