package com.design.behavior.command;

/**
 * @author Andy
 * @date 18/6/14
 */
public class Control {


    private Command onCommand, offCommand, changeChannel;

    public Control(Command on, Command off, Command channel) {
        onCommand = on;
        offCommand = off;
        changeChannel = channel;
    }

    public void turnOn() {
        onCommand.execute();
    }

    public void turnOff() {
        offCommand.execute();
    }

    public void changeChannel() {
        changeChannel.execute();
    }

}
