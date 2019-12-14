package com.sl.prototy;

/**
 * @author shuliangzhao
 * @Title: Car
 * @ProjectName design-parent
 * @Description: TODO
 * @date 2019/5/31 22:57
 */
public class Car implements Cloneable{

    public Car() {
        System.out.println("我是一辆跑车...");
    }

    @Override
    public Car clone() {
        Car car = null;
        try{
            car = (Car)super.clone();
        }catch (Exception e) {
            e.printStackTrace();
        }
        return car;
    }
}
