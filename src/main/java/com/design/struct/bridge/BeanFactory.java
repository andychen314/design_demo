package com.design.struct.bridge;

/**
 * @author Andy
 * @date 18/6/7
 */
public class BeanFactory {

    public static Color getColor(String colorName) {
        if (colorName == null) {
            return new Black();
        }
        //创建文档对象
        switch (colorName) {
            case "black":
                //获取包含类名的文本节点
                return new Black();
            case "blue":
                return new Blue();
            case "green":
                return new Green();
            case "red":
                return new Red();
            case "white":
                return new White();
            default:
                return new Black();
        }
    }

    public static Pen getPen(String penName) {
        if (penName == null) {
            return new MiddlePen();
        }
        //创建文档对象
        switch (penName) {
            case "middle":
                //获取包含类名的文本节点
                return new MiddlePen();
            case "small":
                return new SmallPen();
            case "big":
                return new BigPen();
            default:
                return new MiddlePen();
        }

    }
}
