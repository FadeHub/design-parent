package com.sl.factory;

/**
 * @author shuliangzhao
 * @Title: CarFactory
 * @ProjectName design-parent
 * @Description: TODO
 * @date 2019/5/27 22:57
 */
public class CarFactory extends AbstractCarFactory {

    public  <T extends Car> T createCar(Class<T> c) {
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
