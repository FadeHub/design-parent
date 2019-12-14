package com.sl.factory;

/**
 * @author shuliangzhao
 * @Title: BmwCar
 * @ProjectName design-parent
 * @Description: TODO
 * @date 2019/5/27 22:51
 */
public class AudiRedCar implements Car {
    @Override
    public void getColor() {
        System.out.println("红色奥迪车");
    }

    @Override
    public void getTire() {
        System.out.println("红色轮胎");
    }
}
