package com.sl.factory.newabstract;

/**
 * @author shuliangzhao
 * @Title: Bmw
 * @ProjectName design-parent
 * @Description: TODO
 * @date 2020/1/12 18:57
 */
public class Bmw implements Car {
    @Override
    public void drive() {
        System.out.println("宝马车...");
    }
}
