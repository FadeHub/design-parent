package com.sl.single.factory;

import com.sl.single.Singletion;

import java.lang.reflect.Constructor;

/**
 * @author shuliangzhao
 * @Title: SingletionFactory
 * @ProjectName maven-parent
 * @Description: TODO
 * @date 2018/12/23 20:27
 */
public class SingletionFactory {

    private static Singletion singletion;

    static {
        try{
            Class cls = Class.forName(Singletion.class.getName());
            //获得无参构造器
            Constructor declaredConstructor = cls.getDeclaredConstructor();
            //设置无参构造可以访问
            declaredConstructor.setAccessible(true);
            singletion = (Singletion) cls.newInstance();
        }catch (Exception e) {

        }
    }

    public static Singletion getSingletion() {
        return singletion;
    }
}
