package com.design.struct.proxy;

/**
 * @author Andy
 * @date 18/6/6
 */
public class Student implements BuyComputer {

    private int cash;
    private String vip;
    private String username;

    public Student(int cash, String vip, String username) {
        this.cash = cash;
        this.vip = vip;
        this.username = username;
    }

    @Override
    public void buy() {
        if (vip != null && vip.equals("vip")) {
            System.out.print(username + " 是vip 客户，可以直接购买电脑！");
        }
    }

    public int getCash() {
        return cash;
    }

    public void setCash(int cash) {
        this.cash = cash;
    }

    public String getVip() {
        return vip;
    }

    public void setVip(String vip) {
        this.vip = vip;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
