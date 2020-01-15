package com.sl.factory.newabstract;

/**
 * @author shuliangzhao
 * @Title: Benz
 * @ProjectName design-parent
 * @Description: TODO
 * @date 2020/1/12 18:57
 */
public class Benz implements Car {
    @Override
    public void drive() {
        System.out.println("奔驰车...");
    }
}
