package com.design.creator.single;

/**
 * 饿汉式单例
 *
 * @author Andy
 * @date 18/6/6
 */
public class HungrySingle {

    private static HungrySingle hungrySingle = new HungrySingle();

    private HungrySingle() {

    }

    public static HungrySingle getHungrySingle() {
        return hungrySingle;
    }

    public static void main(String[] args) {
        System.out.println("1.  " + getHungrySingle());
        System.out.println("2.  " + getHungrySingle());
        System.out.println("3.  " + getHungrySingle());
    }
}
