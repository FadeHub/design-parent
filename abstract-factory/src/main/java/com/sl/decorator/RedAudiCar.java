package com.sl.decorator;

/**
 * @author shuliangzhao
 * @Title: BmwCar
 * @ProjectName design-parent
 * @Description: TODO
 * @date 2019/6/13 23:30
 */
public class RedAudiCar extends DecoratorCar {

    public RedAudiCar(Car car) {
        super(car);
    }

    @Override
    public void driver() {
        this.color();
        super.driver();
    }

    private void color() {
        System.out.println("红色奥迪车");
    }
}
