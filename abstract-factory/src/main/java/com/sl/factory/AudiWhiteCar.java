package com.sl.factory;

/**
 * @author shuliangzhao
 * @Title: AudiWhiteCar
 * @ProjectName design-parent
 * @Description: TODO
 * @date 2019/5/27 22:53
 */
public class AudiWhiteCar implements Car {
    @Override
    public void getColor() {
        System.out.println("白色奥迪车");
    }

    @Override
    public void getTire() {
        System.out.println("白色轮胎");
    }
}
