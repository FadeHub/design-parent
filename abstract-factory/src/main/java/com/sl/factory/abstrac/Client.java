package com.sl.factory.abstrac;

/**
 * @author shuliangzhao
 * @Title: Client
 * @ProjectName design-parent
 * @Description: TODO
 * @date 2019/5/28 0:08
 */
public class Client {

    public static void main(String[] args) {
        //生产v6发动机 黑色车
        CarFactory carFactory = new V6Factory();
        Car audiBlackCar = carFactory.createAudiBlackCar();
        audiBlackCar.engine();
        audiBlackCar.getColor();
        audiBlackCar.getTire();
        //生产v12发动机 红色车
        CarFactory carFactory1 = new V12Factory();
        Car audiRedCar = carFactory1.createAudiRedCar();
        audiRedCar.getTire();
        audiRedCar.getColor();
        audiRedCar.engine();
    }
}
