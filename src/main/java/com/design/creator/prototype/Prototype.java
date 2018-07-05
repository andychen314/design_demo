package com.design.creator.prototype;

/**
 * @author Andy
 * @date 18/6/6
 */
public class Prototype implements Cloneable{

    @Override
    public Prototype clone(){
        Prototype prototype = null;
        try{
            prototype = (Prototype)super.clone();
        }catch(CloneNotSupportedException e){
            e.printStackTrace();
        }
        return prototype;
    }
}
