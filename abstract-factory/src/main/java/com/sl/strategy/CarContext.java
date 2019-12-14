package com.sl.strategy;

/**
 * @author shuliangzhao
 * @Title: CarContext
 * @ProjectName design-parent
 * @Description: TODO
 * @date 2019/5/26 20:43
 */
public class CarContext {

    private CarStrategy carStrategy;

    public CarContext(CarStrategy carStrategy) {
        this.carStrategy = carStrategy;
    }

    public void create() {
        carStrategy.createCar();
    }
}
