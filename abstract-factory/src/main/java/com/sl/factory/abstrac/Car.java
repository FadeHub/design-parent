package com.sl.factory.abstrac;

/**
 * @author shuliangzhao
 * @Title: Car
 * @ProjectName design-parent
 * @Description: TODO
 * @date 2019/5/27 23:54
 */
public interface Car {
    //每个车都有颜色
    public void getColor();

    //每个车都有轮胎颜色
    public void getTire();

        //发动机
    public void engine();
}
