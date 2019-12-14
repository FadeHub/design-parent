package com.sl.factory;

/**
 * @author shuliangzhao
 * @Title: AbstractCarFactory
 * @ProjectName design-parent
 * @Description: TODO
 * @date 2019/5/27 22:56
 */
public abstract class AbstractCarFactory {
    public abstract <T extends Car> T createCar(Class<T> c);
}
