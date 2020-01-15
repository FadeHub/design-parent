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
        CarFactory v6 = FactoryProduct.getFactory("v6");
        Car audiBlackCar = v6.createCar("black");
        audiBlackCar.engine();
        audiBlackCar.getColor();
        audiBlackCar.getTire();
        System.out.println("=============================");
        //生产v12发动机 红色车
        CarFactory v12 = FactoryProduct.getFactory("v6");
        Car audiRedCar = v12.createCar("red");
        audiRedCar.getTire();
        audiRedCar.getColor();
        audiRedCar.engine();
    }
}
