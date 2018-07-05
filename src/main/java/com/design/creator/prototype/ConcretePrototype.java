package com.design.creator.prototype;

/**
 * @author Andy
 * @date 18/6/6
 */
public class ConcretePrototype extends Prototype {

    public void show(){
        System.out.println("原型模式实现类");
    }

    public static void main(String[] args){
        ConcretePrototype cp = new ConcretePrototype();
        for(int i=0; i< 10; i++){
            ConcretePrototype clonecp = (ConcretePrototype)cp.clone();
            clonecp.show();
            System.out.println(clonecp);
        }
    }
}
