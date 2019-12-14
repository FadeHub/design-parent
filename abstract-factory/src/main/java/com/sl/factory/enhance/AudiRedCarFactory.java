package com.sl.factory.enhance;

import com.sl.factory.AudiRedCar;
import com.sl.factory.Car;

/**
 * @author shuliangzhao
 * @Title: AudiRedCarFactory
 * @ProjectName design-parent
 * @Description: TODO
 * @date 2019/5/27 23:32
 */
public class AudiRedCarFactory extends AbstractEnCarFactory {
    @Override
    public Car createCar() {
        return new AudiRedCar();
    }
}
