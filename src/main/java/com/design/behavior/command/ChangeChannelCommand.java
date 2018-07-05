package com.design.behavior.command;

/**
 * @author Andy
 * @date 18/6/14
 */
public class ChangeChannelCommand implements Command {

    private Tv myTv;
    private int channelNum;

    public ChangeChannelCommand(Tv myTv, int channelNum) {
        this.myTv = myTv;
        this.channelNum = channelNum;
    }

    @Override
    public void execute() {
        myTv.changeChannel(channelNum);
    }
}
