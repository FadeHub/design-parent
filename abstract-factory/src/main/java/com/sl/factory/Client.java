package com.sl.factory;

/**
 * @author shuliangzhao
 * @Title: Client
 * @ProjectName design-parent
 * @Description: TODO
 * @date 2019/5/27 23:01
 */
public class Client {

    public static void main(String[] args) {
        AbstractCarFactory carFactory = new CarFactory();
        AudiBlackCar audiBlackCar = carFactory.createCar(AudiBlackCar.class);
        audiBlackCar.getColor();
        audiBlackCar.getTire();
        System.out.println("+++++++++++++++++++++");
        AudiWhiteCar audiWhiteCar = carFactory.createCar(AudiWhiteCar.class);
        audiWhiteCar.getColor();
        audiWhiteCar.getTire();
        System.out.println("+++++++++++++++++++++");
        AudiRedCar audiRedCar = carFactory.createCar(AudiRedCar.class);
        audiRedCar.getColor();
        audiRedCar.getTire();
    }
}
