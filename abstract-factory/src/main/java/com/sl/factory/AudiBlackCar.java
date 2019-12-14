package com.sl.factory;

/**
 * @author shuliangzhao
 * @Title: AudiCar
 * @ProjectName design-parent
 * @Description: TODO
 * @date 2019/5/27 22:50
 */
public class AudiBlackCar implements Car {
    @Override
    public void getColor() {
        System.out.println("黑色奥迪车");
    }

    @Override
    public void getTire() {
        System.out.println("黑色轮胎");
    }
}
