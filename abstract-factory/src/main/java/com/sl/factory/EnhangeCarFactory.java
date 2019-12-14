package com.sl.factory;

/**
 * @author shuliangzhao
 * @Title: EnhangeCarFactory
 * @ProjectName design-parent
 * @Description: TODO
 * @date 2019/5/27 23:24
 */
public class EnhangeCarFactory {
    public static   <T extends Car> T createCar(Class<T> c) {
        //定义一个车
        Car car = null;
        try {
            car = (T)Class.forName(c.getName()).newInstance();
        }catch (Exception e) {
            System.out.println("车生产错误");
        }
        return (T)car;
    }
}
