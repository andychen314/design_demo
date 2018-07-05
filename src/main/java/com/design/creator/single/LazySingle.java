package com.design.creator.single;

/**
 * 懒汉式
 *
 * @author Andy
 * @date 18/6/6
 */
public class LazySingle {

    private static LazySingle lazySingle;

    private LazySingle(){

    }

    public static LazySingle getLazySingle(){

        if(lazySingle==null){
            synchronized (LazySingle.class){
                if(lazySingle==null){
                    lazySingle=new LazySingle();
                }
            }
        }
        return lazySingle;
    }
}
