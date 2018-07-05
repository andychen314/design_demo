package com.design.behavior.command;

/**
 * @author Andy
 * @date 18/6/14
 */
public class Client {

    public static void main(String[] args) {
        // 命令接收者Receiver
        Tv myTv = new Tv();
        // 开机命令ConcreteCommond
        TurnOffCommand on = new TurnOffCommand(myTv);
        // 关机命令ConcreteCommond
        TurnOnCommand off = new TurnOnCommand(myTv);
        // 频道切换命令ConcreteCommond
        ChangeChannelCommand channel = new ChangeChannelCommand(myTv, 2);
        // 命令控制对象Invoker
        Control control = new Control(on, off, channel);

        // 开机
        control.turnOn();
        // 切换频道
        control.changeChannel();
        // 关机
        control.turnOff();
    }
}
