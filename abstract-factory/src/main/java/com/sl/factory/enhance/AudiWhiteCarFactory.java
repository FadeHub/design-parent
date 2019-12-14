package com.sl.factory.enhance;

import com.sl.factory.AudiWhiteCar;
import com.sl.factory.Car;

/**
 * @author shuliangzhao
 * @Title: AudiWhiteCarFactory
 * @ProjectName design-parent
 * @Description: TODO
 * @date 2019/5/27 23:32
 */
public class AudiWhiteCarFactory extends AbstractEnCarFactory {
    @Override
    public Car createCar() {
        return new AudiWhiteCar();
    }
}
