package com.sl.strategy;

/**
 * @author shuliangzhao
 * @Title: Context
 * @ProjectName design-parent
 * @Description: TODO
 * @date 2020/1/11 11:21
 */
public class Context {

    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public int doSomething(int a,int b) {
       return strategy.doSometing(a,b);
    }
}

