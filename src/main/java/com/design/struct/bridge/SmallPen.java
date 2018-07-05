package com.design.struct.bridge;

/**
 * @author Andy
 * @date 18/6/7
 */
public class SmallPen extends Pen {

    @Override
    public void draw(String name) {
        String penType="小号毛笔绘制";
        this.color.bepaint(penType, name);
    }

}
