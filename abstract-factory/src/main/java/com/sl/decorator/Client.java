package com.sl.decorator;

/**
 * @author shuliangzhao
 * @Title: Client
 * @ProjectName design-parent
 * @Description: TODO
 * @date 2019/6/13 23:32
 */
public class Client {

    public static void main(String[] args) {
        Car car = new AudiCar();
        car.driver();
        Car redCar = new RedAudiCar(car) ;
        redCar.driver();
        Car blueCar = new BlueAudiCar(car);
        blueCar.driver();
    }
}
