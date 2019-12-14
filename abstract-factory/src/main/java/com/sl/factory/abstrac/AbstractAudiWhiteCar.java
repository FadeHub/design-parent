package com.sl.factory.abstrac;

/**
 * @author shuliangzhao
 * @Title: AbstractAudiBlackCar
 * @ProjectName design-parent
 * @Description: TODO
 * @date 2019/5/27 23:59
 */
public abstract class AbstractAudiWhiteCar implements Car {
    //黑色奥迪车
    public void getColor(){
        System.out.println("白色奥迪车");
    }

    //黑色轮胎
    public void getTire(){
        System.out.println("白色轮胎");
    }

}
