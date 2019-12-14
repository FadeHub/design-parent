package com.sl.factory.abstrac;

/**
 * @author shuliangzhao
 * @Title: V12Factory
 * @ProjectName design-parent
 * @Description: TODO
 * @date 2019/5/28 0:08
 */
public class V12Factory implements CarFactory {
    @Override
    public Car createAudiBlackCar() {
        return new V12AudiBlackCar();
    }

    @Override
    public Car createAudiRedCar() {
        return new V12AudiRedCar();
    }

    @Override
    public Car createAudiWhiteCar() {
        return new V12AudiWhiteCar();
    }
}
