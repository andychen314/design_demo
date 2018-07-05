package com.design.struct.bridge;

/**
 * @author Andy
 * @date 18/6/7
 */
public class Client {

    public static void main(String a[]) {

        Color color = BeanFactory.getColor("blue");
        Pen pen =BeanFactory.getPen(null);

        pen.setColor(color);
        pen.draw("鲜花");
    }
}
