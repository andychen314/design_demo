package com.design.struct.proxy;

/**
 * @author Andy
 * @date 18/6/6
 */
public class ProxyBuyComputer implements BuyComputer {


    private Student student;

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public void buy() {
        if (student.getVip().equals("vip")) {
            student.buy();
            return;
        }
        if (student.getCash() >= 5000) {
            System.out.println(student.getUsername() + "买了新电脑，交易结束！");
        } else {
            System.out.println(student.getUsername() + "钱不够，不能买电影，继续挣钱！");
        }
    }
}
