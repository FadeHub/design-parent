package com.sl.decorator;

/**
 * @author shuliangzhao
 * @Title: BlueAudiCar
 * @ProjectName design-parent
 * @Description: TODO
 * @date 2019/6/13 23:31
 */
public class BlueAudiCar extends DecoratorCar {

    public BlueAudiCar(Car car) {
        super(car);
    }

    @Override
    public void driver() {
        this.color();
        super.driver();
    }

    private void color() {
        System.out.println("蓝色奥迪车");
    }
}
