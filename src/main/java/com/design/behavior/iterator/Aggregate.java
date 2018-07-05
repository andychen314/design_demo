package com.design.behavior.iterator;

/**
 * @author Andy
 * @date 18/6/21
 */
public abstract class Aggregate {
    /**
     * 工厂方法，创建相应迭代子对象的接口
     */
    public abstract Iterator createIterator();
}
