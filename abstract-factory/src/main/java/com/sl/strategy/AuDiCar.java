package com.sl.strategy;

/**
 * @author shuliangzhao
 * @Title: AuDiCar
 * @ProjectName design-parent
 * @Description: TODO
 * @date 2019/5/26 20:41
 */
public class AuDiCar implements CarStrategy {
    @Override
    public void createCar() {
        System.out.println("造奥迪车");
    }
}
