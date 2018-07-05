package com.design.behavior.command;

/**
 * @author Andy
 * @date 18/6/14
 */
public class TurnOnCommand implements Command {

    private Tv myTv;

    public TurnOnCommand(Tv myTv) {
        this.myTv = myTv;
    }

    @Override
    public void execute() {
        myTv.turnOn();
    }
}
