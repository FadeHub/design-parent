package com.sl.factory.abstrac;

/**
 * @author shuliangzhao
 * @Title: V6Factory
 * @ProjectName design-parent
 * @Description: TODO
 * @date 2019/5/28 0:07
 */
public class V6Factory implements CarFactory {
    @Override
    public Car createAudiBlackCar() {
        return new V6AudiBlackCar();
    }

    @Override
    public Car createAudiRedCar() {
        return new V6AudiRedCar();
    }

    @Override
    public Car createAudiWhiteCar() {
        return new V6AudiWhiteCar();
    }
}
