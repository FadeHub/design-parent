package com.sl.decorator;

/**
 * @author shuliangzhao
 * @Title: DecoratorCar
 * @ProjectName design-parent
 * @Description: TODO
 * @date 2019/6/13 23:28
 */
public abstract class DecoratorCar extends Car{

    private Car car;

    public DecoratorCar(Car car) {
        this.car = car;
    }

    @Override
    public void driver() {
        car.driver();
    }
}
