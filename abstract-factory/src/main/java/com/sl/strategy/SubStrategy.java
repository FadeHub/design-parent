package com.sl.strategy;

/**
 * @author shuliangzhao
 * @Title: SubStrategy
 * @ProjectName design-parent
 * @Description: TODO
 * @date 2020/1/11 11:19
 */
public class SubStrategy implements Strategy {
    public int doSometing(int a, int b) {
        return a-b;
    }
}
