package com.sl.factory.abstrac;

import org.apache.commons.lang3.StringUtils;

/**
 * @author shuliangzhao
 * @Title: V6Factory
 * @ProjectName design-parent
 * @Description: TODO
 * @date 2019/5/28 0:07
 */
public class V6Factory implements CarFactory {

    @Override
    public Car createCar(String color) {
        if (StringUtils.equals("black",color)) {
            return new V6AudiBlackCar();
        } else  if (StringUtils.equals("red",color)) {
            return new V6AudiRedCar();
        }
        return null;
    }
}
