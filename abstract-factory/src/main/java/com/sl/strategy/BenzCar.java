package com.sl.strategy;

/**
 * @author shuliangzhao
 * @Title: BenzCar
 * @ProjectName design-parent
 * @Description: TODO
 * @date 2019/5/26 20:43
 */
public class BenzCar implements CarStrategy {
    @Override
    public void createCar() {
        System.out.println("造奔驰");
    }
}
