package com.sl.decorator;

/**
 * @author shuliangzhao
 * @Title: AudiCar
 * @ProjectName design-parent
 * @Description: TODO
 * @date 2019/6/13 23:27
 */
public class AudiCar extends Car {
    @Override
    public void driver() {
        System.out.println("速度为每小时50KM");
    }
}
