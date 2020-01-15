package com.sl.strategy;

/**
 * @author shuliangzhao
 * @Title: AddStrategy
 * @ProjectName design-parent
 * @Description: TODO
 * @date 2020/1/11 11:18
 */
public class AddStrategy implements Strategy {
    public int doSometing(int a, int b) {
        return a+b;
    }
}
