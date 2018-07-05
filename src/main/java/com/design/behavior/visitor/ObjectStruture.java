package com.design.behavior.visitor;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author Andy
 * @date 18/6/13
 */
public class ObjectStruture {

    public static List<Element> getList(){
        List<Element> list = new ArrayList<>();
        Random ran = new Random();
        for(int i=0; i<10; i++){
            int a = ran.nextInt(100);
            if(a>50){
                list.add(new FirstElement());
            }else{
                list.add(new SecondElement());
            }
        }
        return list;
    }

}
