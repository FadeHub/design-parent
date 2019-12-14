package com.sl.creatro;

import com.sl.Car;
import com.sl.Creator;

/**
 * @author shuliangzhao
 * @Title: ConcreteCreator
 * @ProjectName maven-parent
 * @Description: 具体工厂类
 * @date 2018/12/23 15:05
 */
public class ConcreteCreator extends Creator {

    public <T extends Car> T creatorCar(Class<T> t) {
        Car car = null;
        try {
            car = (Car)Class.forName(t.getName()).newInstance();
        }catch (Exception e){

        }
        return (T)car;
    }
}
