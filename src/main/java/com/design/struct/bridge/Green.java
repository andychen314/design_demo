package com.design.struct.bridge;

/**
 * @author Andy
 * @date 18/6/7
 */
public class Green implements Color {
    @Override
    public void bepaint(String penType, String name) {

        System.out.println(penType + "绿色的"+ name + ".");

    }
}
