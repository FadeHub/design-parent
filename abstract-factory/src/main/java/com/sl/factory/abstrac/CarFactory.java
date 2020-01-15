package com.sl.factory.abstrac;

/**
 * @author shuliangzhao
 * @Title: CarFactory
 * @ProjectName design-parent
 * @Description: TODO
 * @date 2019/5/28 0:05
 */
public interface CarFactory {
    public Car createCar(String color);
}
