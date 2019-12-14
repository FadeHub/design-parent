package com.sl.strategy;

/**
 * @author shuliangzhao
 * @Title: CarFactory
 * @ProjectName design-parent
 * @Description: TODO
 * @date 2019/5/26 20:44
 */
public class CarFactory {
    public static void main(String[] args) {
        CarContext carContext;
        carContext = new CarContext(new AuDiCar());
        carContext.create();
        System.out.println("=======================");
        carContext = new CarContext(new BenzCar());
        carContext.create();
        System.out.println("=======================");
        carContext = new CarContext(new BMWCar());
        carContext.create();
    }
}
