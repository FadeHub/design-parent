package com.sl.adapter;

/**
 * @author shuliangzhao
 * @Title: ConcreteTarget
 * @ProjectName design-parent
 * @Description: TODO
 * @date 2019/5/26 22:29
 */
public class ConcreteTarget implements Target {
    @Override
    public void doSomeing() {
        System.out.println("我是一个小小鸟...");
    }
}
