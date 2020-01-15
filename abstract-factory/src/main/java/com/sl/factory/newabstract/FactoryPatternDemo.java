package com.sl.factory.newabstract;

/**
 * @author shuliangzhao
 * @Title: FactoryPatternDemo
 * @ProjectName design-parent
 * @Description: TODO
 * @date 2020/1/12 18:59
 */
public class FactoryPatternDemo {

    public static void main(String[] args) {
        //老板告诉司机我今天坐奔驰
        Car car = DriverFactroy.createCar("benz");
        //司机开着奔驰出发
        car.drive();
    }
}
