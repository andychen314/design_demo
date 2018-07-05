package com.design.behavior.command;

/**
 * @author Andy
 * @date 18/6/14
 */
public class TurnOffCommand implements Command {

    private Tv myTv;

    public TurnOffCommand(Tv myTv) {
        this.myTv = myTv;
    }

    @Override
    public void execute() {
        myTv.turnOff();
    }
}
