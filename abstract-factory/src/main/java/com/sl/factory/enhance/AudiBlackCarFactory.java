package com.sl.factory.enhance;

import com.sl.factory.AudiBlackCar;
import com.sl.factory.Car;

/**
 * @author shuliangzhao
 * @Title: AudiBlackCarFactory
 * @ProjectName design-parent
 * @Description: TODO
 * @date 2019/5/27 23:31
 */
public class AudiBlackCarFactory extends AbstractEnCarFactory {

    @Override
    public Car createCar() {
        return new AudiBlackCar();
    }
}
