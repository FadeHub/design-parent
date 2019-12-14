package com.sl.factory.enhance;

import com.sl.factory.Car;

/**
 * @author shuliangzhao
 * @Title: Client
 * @ProjectName design-parent
 * @Description: TODO
 * @date 2019/5/27 23:33
 */
public class Client {

    public static void main(String[] args) {
        Car audiBlackCar = new AudiBlackCarFactory().createCar();
        audiBlackCar.getColor();
        audiBlackCar.getTire();
        Car audiRedCar = new AudiRedCarFactory().createCar();
        audiRedCar.getColor();
        audiRedCar.getTire();
        Car audiWhiteCar = new AudiWhiteCarFactory().createCar();
        audiWhiteCar.getColor();
        audiWhiteCar.getTire();
    }
}
