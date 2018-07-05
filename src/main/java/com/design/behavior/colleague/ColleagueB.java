package com.design.behavior.colleague;

/**
 * @author Andy
 * @date 18/6/21
 */
public class ColleagueB extends AbstractColleague {
    @Override
    public void setNumber(int number, AbstractMediator am) {
        this.number = number;
        am.BaffectA();
    }
}
