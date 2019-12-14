package com.sl;

/**
 * @author shuliangzhao
 * @Title: Product
 * @ProjectName maven-parent
 * @Description: 抽象产品类汽车
 * @date 2018/12/23 14:55
 */
public abstract class Car {

    /**
     * 产品类公共方法
     */
    public void run() {
        System.out.println("汽车在移动！");
    }

    /**
     * 汽车品牌
     */
    public abstract void brand();

}
