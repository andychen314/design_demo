package com.design.behavior.colleague;

/**
 * @author Andy
 * @date 18/6/21
 */
public class Mediator extends AbstractMediator {

    public Mediator(AbstractColleague a, AbstractColleague b) {
        super(a, b);
    }

    @Override
    public void AaffectB() {
        int number = a.getNumber();
        b.setNumber(number * 100);
    }

    @Override
    public void BaffectA() {
        int number = b.getNumber();
        a.setNumber(number / 100);
    }
}
