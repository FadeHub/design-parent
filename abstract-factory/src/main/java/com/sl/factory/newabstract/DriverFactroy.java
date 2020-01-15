package com.sl.factory.newabstract;

/**
 * @author shuliangzhao
 * @Title: DriverFactroy
 * @ProjectName design-parent
 * @Description: TODO
 * @date 2020/1/12 18:58
 */
public class DriverFactroy {

    public static Car createCar(String car) {
        Car c = null;
        if("Benz".equalsIgnoreCase(car))
            c = new Benz();
        else if("Bmw".equalsIgnoreCase(car))
            c = new Bmw();
        return c;
    }
}
