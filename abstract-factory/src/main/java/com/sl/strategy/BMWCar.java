package com.sl.strategy;

/**
 * @author shuliangzhao
 * @Title: BMWCar
 * @ProjectName design-parent
 * @Description: TODO
 * @date 2019/5/26 20:42
 */
public class BMWCar implements CarStrategy {
    @Override
    public void createCar() {
        System.out.println("造宝马");
    }
}
