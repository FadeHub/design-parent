package com.sl.factory.abstrac;

import org.apache.commons.lang3.StringUtils;

/**
 * @author shuliangzhao
 * @Title: V12Factory
 * @ProjectName design-parent
 * @Description: TODO
 * @date 2019/5/28 0:08
 */
public class V12Factory implements CarFactory {

    @Override
    public Car createCar(String color) {
        if (StringUtils.equals("black",color)) {
            return new V12AudiBlackCar();
        } else  if (StringUtils.equals("red",color)) {
            return new V12AudiRedCar();
        }
        return null;
    }
}
