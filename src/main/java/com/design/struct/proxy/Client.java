package com.design.struct.proxy;

/**
 * @author Andy
 * @date 18/6/6
 */
public class Client {
    public static void main(String[] args) {

        Student jeck = new Student(6000, "", "Jeck");
        Student rose = new Student(4000, "", "Rose");
        Student tom = new Student(0, "vip", "Tom");

        System.out.println();

        ProxyBuyComputer proxyBuyComputer = new ProxyBuyComputer();
        proxyBuyComputer.setStudent(jeck);
        proxyBuyComputer.buy();

        proxyBuyComputer.setStudent(rose);
        proxyBuyComputer.buy();

        proxyBuyComputer.setStudent(tom);
        proxyBuyComputer.buy();
        System.out.println();

    }

}
