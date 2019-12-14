package com.sl.factory.abstrac;

/**
 * @author shuliangzhao
 * @Title: CarFactory
 * @ProjectName design-parent
 * @Description: TODO
 * @date 2019/5/28 0:05
 */
public interface CarFactory {
    //黑色车
    public Car createAudiBlackCar();
    //红色车
    public Car createAudiRedCar();
    //白色车
    public Car createAudiWhiteCar();
}
