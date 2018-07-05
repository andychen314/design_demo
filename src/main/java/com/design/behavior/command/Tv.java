package com.design.behavior.command;

/**
 * @author Andy
 * @date 18/6/14
 */
public class Tv {

    public void turnOn() {
        System.out.println("打开电视机");
    }

    public void turnOff() {
        System.out.println("关闭电视机");
    }

    public void changeChannel(int channelNum) {
        System.out.println("更换频道到：" + channelNum);
    }
}
